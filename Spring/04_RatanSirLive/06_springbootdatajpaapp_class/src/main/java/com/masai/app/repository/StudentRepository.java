package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Student;
import com.masai.app.model.StudentDTO;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	//if we are sure that with that filed atmost one record will come 
	//here findBY..Marks (this Marks is the name of variable) 
	//public Optional<Student> findByMarks(int marks);
	//or
	//public Student findByMarks(int marks);
	
	//if with that column multiple record chances are there 
	//then take the return type as 
	
	public List<Student> findByMarks(int marks);
	
	//using Named parameter
	@Query("select s.name from Student s where s.roll=:roll")        
	public String getStudentNameByRoll(@Param("roll") int roll);
	
	//using Positional parameter
//	@Query("select s from Student s where s.marks=?1")        
//	public List<Student> getStudentByMarks(int marks);
//	

	
//	@Query("select s.marks from Student s where s.roll=?1")        
//	public Integer getStudentMarksByRoll(int roll);
	
//	@Query("select s.marks from Student s where s.address=?1")        
//	public List<Integer> getStudentMarksByAddress(String address);
	
	
	@Query("select s.address,s.marks from Student s where roll =?1")
	public String getAddressAndMarksByRoll(int roll);
	
	
	
	@Query("select new com.masai.app.model.StudentDTO(s.address, s.marks) from Student s where roll =?1")
	public StudentDTO getAddressAndMarksByRoll2(int roll);
	
	
	
	
	
	
	
	
	
	
	
}
