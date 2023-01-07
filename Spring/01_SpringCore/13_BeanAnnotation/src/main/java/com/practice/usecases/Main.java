package com.practice.usecases;
import com.practice.configuration.AppConfig;
import com.practice.model.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       A a = context.getBean("a",A.class);
        a.funcA();

        ((AnnotationConfigApplicationContext)context).close();
            }
}