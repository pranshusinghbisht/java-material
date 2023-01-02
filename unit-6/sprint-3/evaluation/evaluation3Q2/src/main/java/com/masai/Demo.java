package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext apc = new AnnotationConfigApplicationContext(appConfig.class);
		StudentService es = apc.getBean("studentService", StudentService.class);
		es.printMap();
		es.printList();
		es.printAppName();

	}
}

