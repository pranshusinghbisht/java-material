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

    // we cant sent crutial/sensative data from url bar through pathvariable or requestparam. only small small data we can send.

    // we can send data from the http request body

//    @PostMapping(value = "/students", consumes = MediaType.APPLICATION_JSON_VALUE) // either we can write this way or we know that default type is JSON so this long form @consume is optional


    @PostMapping("/students")
    public String saveStudentHandler(@RequestBody Student student){

        // save that student object send by the client inside the DB

        return student.toString() +" Saved Successfully...!";
    }
}


// we use third party app to send data like postman send data in the form of JSON



