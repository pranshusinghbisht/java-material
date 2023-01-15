package com.example.controller;

import com.example.exception.InvalidNumberException;
import com.example.model.Student;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //
public class MyController {


@GetMapping("/student")
public Student getStudentHandler(){
    Student student = new Student(10,"Ram",123);
    return student;

}

@PostMapping("/students")
public String saveStuentHandler(@Valid @RequestBody Student student){
    return "Saved..."+student;
}

}
