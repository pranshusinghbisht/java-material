package com.practice.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class A{

    @Value("${id}")
    private int value;

    private B b1;

    @Autowired
    List<String> cities;

    @Autowired
    List<String> list;

    @Autowired
    Student s1;




@Autowired
    public void setB1(B b1) {
        this.b1 = b1;
    }


    public void funcA(){
        System.out.println("Inside funcA...");
        System.out.println(b1);
        System.out.println(list);
        System.out.println(s1);
        System.out.println(value);
    }

}
