package com.practice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class Employee {
    @Value("${id}")
    private int id;

    @Value("${name}")
    private String name;

    @Value("${salary}")
    private int salary;

    @Autowired
    private Environment env;


    public void getData(){

        System.out.println(env.getProperty("id"));
        System.out.println(env.getProperty("name"));
        System.out.println(env.getProperty("salary"));


        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
