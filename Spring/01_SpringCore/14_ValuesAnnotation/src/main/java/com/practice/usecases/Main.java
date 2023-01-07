package com.practice.usecases;
import com.practice.configuration.AppConfig;
import com.practice.model.A;
import com.practice.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       Employee employee = context.getBean("employee", Employee.class);
        employee.getData();

        ((AnnotationConfigApplicationContext)context).close();
            }
}