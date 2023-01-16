package com.masai.app.service;

import java.util.List;

import com.masai.app.exception.StudentException;
import com.masai.app.model.Student;
import com.masai.app.model.StudentDTO;

public interface StudentService {
	
	//this method will take a student obj without roll
	//and return the saved studen object with auto-generated roll
	public Student saveStudentDetails(Student student);
	
	
	public Student getStudentByRoll(Integer roll)throws StudentException;

	public List<Student> getAllStudentDetails()throws StudentException;
	
	//return deleted student
	public Student deleteStudentByRoll(Integer roll)throws StudentException;
	
	
	public Student updateStudentDetails(Student student)throws StudentException;
	
	public Student updateMarksForStudentByRoll(Integer roll, Integer gmarks)throws StudentException;
	
	public List<Student> getStudentByMarks(Integer marks)throws StudentException;
	
	
	public String getStudentAddressAndMarksByRoll(Integer roll)throws StudentException;
	
	public StudentDTO getStudentAddressAndMarksByRoll2(Integer roll)throws StudentException;
	
	
	
	
	
	
	
}
