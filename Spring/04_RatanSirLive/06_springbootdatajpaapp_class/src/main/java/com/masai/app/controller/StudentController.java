package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Student;
import com.masai.app.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/students")
	public ResponseEntity<Student> saveStudentHandler(@RequestBody Student student) {

		Student savedStudent = studentService.saveStudentDetails(student);

		return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	}

	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll) {

		Student student = studentService.getStudentByRoll(roll);

		return new ResponseEntity<>(student, HttpStatus.OK);

	}

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentsHandler() {

		List<Student> students = studentService.getAllStudentDetails();

		return new ResponseEntity<>(students, HttpStatus.OK);
	}

	@DeleteMapping("/students/{roll}")
	public ResponseEntity<Student> deleteStudentByRollHandler(@PathVariable Integer roll) {

		Student student = studentService.deleteStudentByRoll(roll);

		return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
	}

	@PutMapping("/students")
	public ResponseEntity<Student> updateStudentHandler(@RequestBody Student student) {

		Student updatedstudent = studentService.updateStudentDetails(student);

		return new ResponseEntity<>(updatedstudent, HttpStatus.ACCEPTED);
	}

	
	@PatchMapping("/students/{roll}")
	public ResponseEntity<Student> updateStudentMarksHandler(@PathVariable("roll") Integer roll, 
															@RequestParam("gMarks") Integer gMarks) {

		Student updatedstudent = studentService.updateMarksForStudentByRoll(roll, gMarks);

		return new ResponseEntity<>(updatedstudent, HttpStatus.ACCEPTED);
	}
	
	//getStudent/500/hello/20
	@GetMapping("/getstudent/{marks}")
	public ResponseEntity<List<Student>> getStudentByMarksHandler(@PathVariable("marks") Integer marks) {


		  List<Student> students= studentService.getStudentByMarks(marks);
		
		
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
	
	@GetMapping("/getstudent2/{roll}")
	public ResponseEntity<String> getAddrAndMarksByRollHandler(@PathVariable Integer roll){
		
		String result= studentService.getStudentAddressAndMarksByRoll(roll);
		
		
		
		return new ResponseEntity<>(result,HttpStatus.OK);
		
		
		
	}


	
	
	
	
	
	
}
