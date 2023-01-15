package com.example.app.controller;

import com.example.app.model.Student;
import com.example.app.repository.StudentDao;
import com.example.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public ResponseEntity<Student> saveStudentHandler(@RequestBody Student student){

       Student savedStudent = studentService.saveStudentDetails(student);

       return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);

    }





}
