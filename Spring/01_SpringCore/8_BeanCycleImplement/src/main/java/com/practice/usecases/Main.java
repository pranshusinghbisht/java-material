package com.practice.usecases;


import com.practice.model.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configContext.xml");
       Example example = (Example) context.getBean("example");
        System.out.println(example);



    }
}