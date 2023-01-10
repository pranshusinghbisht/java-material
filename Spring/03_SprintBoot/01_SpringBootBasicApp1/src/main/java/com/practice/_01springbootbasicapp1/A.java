package com.practice._01springbootbasicapp1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Autowired
    private B b;
    public void funcA(){
        System.out.println("Inside funcA of A");
        b.funcB();
    }
}
