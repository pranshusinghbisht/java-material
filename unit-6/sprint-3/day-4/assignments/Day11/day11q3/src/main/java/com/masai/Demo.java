package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {


		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		Travel obj = ctx.getBean("t",Travel.class);
		
		obj.journey();
		

		AnnotationConfigApplicationContext ctx2= (AnnotationConfigApplicationContext)ctx;
		
		ctx2.close();
	}

}
