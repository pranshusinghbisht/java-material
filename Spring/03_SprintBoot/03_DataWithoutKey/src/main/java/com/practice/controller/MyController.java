package com.practice.controller;


import com.practice.model.Student;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController  //this is best
public class MyController {
    @RequestMapping("/welcome")
    public String myWelcomeService() {
        return "Welcome to Spring Boot"; //it will be treated as raw data
    }

    @RequestMapping("/hello")
    public String myHelloService() {
        return "Hello to Spring Boot"; // it will be treated as jsp name. if we use restController it will treat as raw data
    }




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



    @RequestMapping("/students/{roll}")
    public Student getStudentHandler(@PathVariable("roll") Integer roll) {
        Student student = new Student(roll, "Pranshu", "Lucknow", 100);
        return student;
    }



    @GetMapping("/students/{roll}/{name}/{marks}") //shortcut
    public Student getAllStudentHandler(@PathVariable("roll") Integer roll,
                                        @PathVariable("name") String name,
                                        @PathVariable("marks") Integer marks) {
        //connect with DB
        //connect with SL + DAL

        //composing dummy object

        Student student = new Student(roll,name,"Delhi",marks); // we have to use wrapper classes instead of primitive datatype... it is a good practice in spring
        return student;
    }

}



