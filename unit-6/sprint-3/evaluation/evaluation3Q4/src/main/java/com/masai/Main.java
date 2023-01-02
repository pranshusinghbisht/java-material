package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext apc = new ClassPathXmlApplicationContext("applicationContext.xml");
        DrawShape ds =apc.getBean("drawShape",DrawShape.class);
        
        ds.draw(new Triangle());
        ds.draw(new Circle());
        ds.draw(new Cylinder());
    }
}
