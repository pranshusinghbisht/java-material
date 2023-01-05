package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        //actuvate the spring IOC container
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //pulling the spring bean with the help of id.
       MyBusinessClass obj = ac.getBean("mb", MyBusinessClass.class);

       obj.fun1();

    }
}
