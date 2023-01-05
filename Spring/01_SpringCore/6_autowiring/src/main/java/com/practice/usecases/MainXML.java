package com.practice.usecases;

import com.practice.model_xml.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configContext.xml");
      Emp emp =  context.getBean("emp", Emp.class);
        System.out.println(emp);

    }
}
