package com.practice.usecases;

import com.practice.model_annotation.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configContext.xml");
        Emp emp =  context.getBean("emp1", Emp.class);
        System.out.println(emp);

    }
}
