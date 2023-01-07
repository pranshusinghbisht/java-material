package com.practice.usecases;
import com.practice.model.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
/*        ApplicationContext context = new ClassPathXmlApplicationContext("configContext.xml");
       A a = context.getBean("aid", A.class);
        System.out.println(a);

       ClassPathXmlApplicationContext c = (ClassPathXmlApplicationContext)context;
       c.close();*/

        ApplicationContext context1 = new ClassPathXmlApplicationContext("configContext.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("configContext.xml");

        A a1 = context1.getBean("aid", A.class);
        A a2 = context2.getBean("aid", A.class);
        System.out.println(a1==a2);
    }
}