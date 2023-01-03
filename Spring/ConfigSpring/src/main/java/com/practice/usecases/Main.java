package com.practice.usecases;

import com.practice.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Student student1 = (Student) context.getBean("Student1");

        System.out.println(student1);

    }
}
