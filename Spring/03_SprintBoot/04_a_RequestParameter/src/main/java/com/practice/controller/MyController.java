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

/*
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
*/



/*
            this is path variable
    @GetMapping("/students/{roll}")
    public Student getStudentHandler(@PathVariable("roll") Integer roll) {
        Student student = new Student(roll, "Pranshu", "Lucknow", 100);
        return student;
    }*/


//   this is request paramater
    @GetMapping("/students")
    public Student getStudentHandler(@RequestParam("roll") Integer roll, //@RequestParam("key") String key,
                                     @RequestParam(value = "name", required = false) String name){  //required is used for optional here

        Student student = new Student(roll, name, "Lucknow", 100);
        return student;

        //if i putting only roll but name is empty... this is showing name = "null"

    }



}



