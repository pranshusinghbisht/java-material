package com.example.App.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {


    @GetMapping("/home")
    public String homeHandler(){

        return "This is my home page";
    }

    @GetMapping("/login")
    public String loginHandler(){

        return "This is my login page";
    }

    @GetMapping("/register")
    public String registerHandler(){

        return "This is my register page";
    }

}
