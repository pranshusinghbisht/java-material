package com.practice.controller;


import com.practice.model.Student;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;

@RestController  //this is best
public class MyController {

    @GetMapping("/students") //shortcut
    public List<Student> getAllStudentHandler(){

        List<Student> students = Arrays.asList(
                new Student(10,"ram","delhi0",200),
                new Student(11,"ramq","del0",900),
                new Student(18,"ramt","dlhi0",800),
                new Student(15,"rfm","elhi0",700)
                );
        return students;
    }



//  http://localhost:8888/students/10?marks=200

    @GetMapping("/students/{roll}")
    public Student getStudentHandler(@PathVariable("roll") Integer roll, @RequestParam("marks") Integer marks) { // for optional iside @RequestParam -> required = false
        Student student = new Student(roll, "Pranshu", "Lucknow", 100);
        return student;
    }

    // if we combining path variable with request param then .... always path varable will come first
    //here pathvaraible will come first then we need to use request param
    //path varable cant be optional


}



