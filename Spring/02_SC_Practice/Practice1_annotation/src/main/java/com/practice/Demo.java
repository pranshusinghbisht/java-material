package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService ss = applicationContext.getBean("studentService", StudentService.class);
        ss.printMap();

        ss.printList();

        ss.printAppName();
    }
}
