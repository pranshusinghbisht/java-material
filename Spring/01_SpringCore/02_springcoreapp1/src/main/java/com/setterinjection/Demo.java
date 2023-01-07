package com.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Travel travel1 = ac.getBean("t1", Travel.class);
        travel1.journey();

        Travel travel2 = ac.getBean("t2", Travel.class);
        travel2.journey();
    }
}
