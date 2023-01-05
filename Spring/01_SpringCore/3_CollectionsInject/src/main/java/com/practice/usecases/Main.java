package com.practice.usecases;

import com.practice.model.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configContext.xml");
//       Student student1 = (Student) context.getBean("Student1");
            Emp emp = context.getBean(Emp.class,"emp");
        System.out.println(emp.getName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getAddresses());
        System.out.println(emp.getCourses());
    }
}
