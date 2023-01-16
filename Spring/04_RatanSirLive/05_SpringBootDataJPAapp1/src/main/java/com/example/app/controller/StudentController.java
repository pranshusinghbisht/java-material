package com.example.app.controller;

import com.example.app.exception.StudentException;
import com.example.app.model.Student;
import com.example.app.repository.StudentDao;
import com.example.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public ResponseEntity<Student> saveStudentHandler(@RequestBody Student student){

       Student savedStudent = studentService.saveStudentDetails(student);

       return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);

    }

    @GetMapping("/students/{roll}")
    public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll){ // if pathvariable name and local variable is same no needd to write

      Student student =   studentService.getStudentByRoll(roll);

      return new ResponseEntity<>(student,HttpStatus.OK);

    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudentHandler(){

      List<Student> students = studentService.getAllStudentDetails();
      return new ResponseEntity<>(students,HttpStatus.OK);
    }

    @DeleteMapping("/students/{roll}")
    public ResponseEntity<Student> deleteStudentByRollHandler(@PathVariable Integer roll){
    Student student = studentService.deleteStudentByRoll(roll);
    return new ResponseEntity<>(student,HttpStatus.ACCEPTED);
    }

    //doubt
/*
    @PutMapping("/students/{roll}")
    public ResponseEntity<Student> updateStudentByRollHandler(@RequestBody Student student){
        Student updateStudent = studentService.updateStudentDetails(student);
        return new ResponseEntity<>(updateStudent,HttpStatus.ACCEPTED);
    }

    @PutMapping("/students/{roll}")
    //@patch is better at this place
    public ResponseEntity<Student> updateStudentMarksHandler(@PathVariable("roll")Integer roll,
                                                             @RequestParam("gmarks") Integer gmarks){
        Student updateStudent = studentService.updateMarksForStudnetByRoll(roll,gmarks);
        return new ResponseEntity<>(updateStudent,HttpStatus.ACCEPTED);
    }
*/

    //students/{marks} this will not valid
    @GetMapping("/getstudent/{marks}")
    public ResponseEntity<Student> getStudentByMarksHandler(@PathVariable("marks")Integer marks){
      Student student =  studentService.getStudentByMarks(marks);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

}
