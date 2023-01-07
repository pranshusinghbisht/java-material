package com.practice.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
public class A{

    @Autowired(required = false)
    @Qualifier(value = "b5")
    private B b1;

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
