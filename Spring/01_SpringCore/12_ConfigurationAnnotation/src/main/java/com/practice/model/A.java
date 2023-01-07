package com.practice.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
public class A{

//    @Autowired
    private B b1;

@Autowired
    public void setB1(B b1) {
        this.b1 = b1;
    }

    @PostConstruct
    public void mySetup(){
        System.out.println("inside mySetup...");
    }

    @PreDestroy
    public void end(){
        System.out.println("I am end");
    }

    public void funcA(){
        System.out.println("Inside funcA...");
        System.out.println(b1);
    }

}
