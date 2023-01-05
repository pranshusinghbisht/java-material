package com.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        //activate the spring IOC container
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //pulling the spring bean obj the help of if.
        A a = ac.getBean("aobj",A.class);
        a.showA();
    }
}
