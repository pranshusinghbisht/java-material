package com.practice.usecases;


import com.practice.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configContext.xml");
//        Student student = context.getBean(Student.class,"student");
        Student student = context.getBean(Student.class,"obj");
        System.out.println(student); // name of the object with respect to class in camel case


        System.out.println(student.getAddresses());
        System.out.println(student.getAddresses().getClass().getName());
    }
}