package com.practice.usecases;
import com.practice.model.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context1 = new ClassPathXmlApplicationContext("configContext.xml");
        A a1 = context1.getBean("a", A.class);
        a1.funcA();

//        ClassPathXmlApplicationContext c = (ClassPathXmlApplicationContext) context1;
//        c.close();

        ((ClassPathXmlApplicationContext)context1).close();
            }
}