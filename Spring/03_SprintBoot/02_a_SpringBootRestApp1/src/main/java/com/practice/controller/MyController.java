package com.practice.controller;


import com.practice.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
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
}



