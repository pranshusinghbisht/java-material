package com.example.app.repository;

import com.example.app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {

    //here findBy.. Marks (this marks is the name of variable)

    //when we are sure that which that with that field atmost one record will come
//public Optional<Student> findByMarks(int marks); // capital M is the convention we have to follow
//or    public Student findByMarks(int marks); // capital M is the convention we have to follow
    public Student findByMarks(int marks);

//if with that column multiple recors chances are there
    //then take the return type as

   // public List<Student> findByMarks(int marks);









    //findBy.. multiple fields:




    @Query("select s.name from Student s where s.roll=:roll")
    public String getStudentNameByRoll(@Param("roll") int roll);


    @Query("select s.marks from Student s where s.roll=?1")
    public List<Integer> getStudentMarksByAddress(String address);

    @Query("select s.name, s.marks from Student s where s.roll =?1")
    public String getNameAndMarksByRoll(int roll);
}
