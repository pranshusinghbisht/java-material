package com.practice.usecases;

import com.practice.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configContext.xml");
       Person p = context.getBean(Person.class,"person");
        System.out.println(p);
    }
}
