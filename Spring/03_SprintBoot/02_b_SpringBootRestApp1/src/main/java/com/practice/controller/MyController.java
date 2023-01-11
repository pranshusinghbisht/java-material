package com.practice.controller;


import com.practice.model.Student;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

//@Controller
@RestController  //this is best
//@RequestMapping("/studentapp")
public class MyController {

//http://localhost:8080/welcome

    @RequestMapping("/welcome")
//    @ResponseBody  // @Controller + @ResponseBody
    public String myWelcomeService(){
        return "Welcome to Spring Boot"; //it will be treated as raw data
    }

    @RequestMapping("/hello")
    public String myHelloService(){
        return "Hello to Spring Boot"; // it will be treated as jsp name. if we use restController it will treat as raw data
    }

    @RequestMapping("/getStudent")
    public Student getStudentHandler(){
        Student student = new Student(10,"Pranshu","Lucknow",100);
        return student;
    }

//    @RequestMapping("/students")
//    @RequestMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
//    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    @GetMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE)
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
}



