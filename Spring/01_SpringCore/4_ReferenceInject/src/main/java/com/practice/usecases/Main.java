package com.practice.usecases;

import com.practice.model.A;
import com.practice.model.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configContext.xml");
//       Student student1 = (Student) context.getBean("Student1");
            A temp = context.getBean(A.class,"aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());

    }
}
