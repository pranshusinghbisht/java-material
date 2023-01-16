package com.masai.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.StudentException;
import com.masai.app.model.Student;
import com.masai.app.model.StudentDTO;
import com.masai.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student saveStudentDetails(Student student) {
		
		//the supplied object will not have Id
		//where as saved object will have auto-generated id
		Student savedStudent= studentRepo.save(student);
		
		
		return savedStudent;
		
	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException{
		
//			Optional<Student> opt= sRepo.findById(roll);
//		
//			if(opt.isPresent()) {
//				Student student= opt.get();
//		
//				return student;
//			}
//			else
//				throw new StudentException("Student does not exist with roll "+roll);
		
		
		return studentRepo.findById(roll).orElseThrow(() -> new StudentException("Student does not exist with roll :"+roll) );
		
		
		
		
		
		
		
	}

	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		
		List<Student> students= studentRepo.findAll();
		
		if(students.isEmpty())
			throw new StudentException("No student found..");
		
		return students;	
			
			
	}

	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {
		
		Optional<Student> opt= studentRepo.findById(roll);
		
		if(opt.isPresent()) {
			
			Student student= opt.get();
			
			studentRepo.delete(student);
			
			return student;
			
		}
		else
			throw new StudentException("Student does not exist with roll :"+roll);
		
		
		
	}

	@Override
	public Student updateStudentDetails(Student student) throws StudentException {
		
		
		Optional<Student> opt= studentRepo.findById(student.getRoll());
		
		if(opt.isPresent()) {
			
			Student existingStudent= opt.get();

			
			// here save method will perfom save or update operation
			
			return studentRepo.save(student);
			
			
		}else
			throw new StudentException("Invalid Student :");
		
		
		
		
	}

	@Override
	public Student updateMarksForStudentByRoll(Integer roll, Integer gmarks) throws StudentException {
		
		
		Optional<Student> opt= studentRepo.findById(roll);
		
		if(opt.isPresent()) {
			
			Student existingStudent= opt.get();
			existingStudent.setMarks(existingStudent.getMarks()+gmarks);
			
			return studentRepo.save(existingStudent);
			
			
			
		}
		else
			throw new StudentException("Student does not exist with roll :"+roll);
		
		
		
		
		
	}

	@Override
	public List<Student> getStudentByMarks(Integer marks) throws StudentException {
		
		List<Student> students= studentRepo.findByMarks(marks);
		
		if(!students.isEmpty())
			return students;
		else
			throw new StudentException("No student found with Marks: "+marks);
		
		
		
	}

	@Override
	public String getStudentAddressAndMarksByRoll(Integer roll) throws StudentException {
		
		String result= studentRepo.getAddressAndMarksByRoll(roll);
		
		if(result == null)
			throw new StudentException("Student does not exist with roll "+roll);
		else
			return result;
	}

	@Override
	public StudentDTO getStudentAddressAndMarksByRoll2(Integer roll) throws StudentException {
	StudentDTO dto= studentRepo.getAddressAndMarksByRoll2(roll);
		
		if(dto == null)
			throw new StudentException("Student does not exist with roll "+roll);
		else
			return dto;
	}

}
