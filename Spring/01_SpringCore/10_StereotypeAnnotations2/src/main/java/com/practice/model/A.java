package com.practice.model;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class A{

    public void funcA(){
        System.out.println("Inside funcA...");
    }

}
