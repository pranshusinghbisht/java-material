package com.masai;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {


	 @Autowired
	 private Environment env;
	 
	 @Bean
	 public List<String> getList(){
		 
		 List<String> cities=new ArrayList<>();
		 
			cities.add(env.getProperty("c1"));
			cities.add(env.getProperty("c2"));
			cities.add(env.getProperty("c3"));
			cities.add(env.getProperty("c4"));
			cities.add(env.getProperty("c5"));
			
			
			return cities;
		 
	 }
	
	@Bean
	public Student getStudent1() {
		
		Student s1=new Student(1,"geeta",480);
			
		return s1;
	}
	
	
	@Bean
	public Student getSecondStudent2() {
		Student s2=new Student(2,"bansi",380);
		
		
		return s2;
	}
	
	
	@Bean
	public Student getSecondStudent3() {
		Student s3=new Student(3,"aatish",420);
		
		
		return s3;
	}
	
	@Bean
	public Student getSecondStudent4() {
		Student s4=new Student(4,"vimal",450);
		
		
		return s4;
	}
	
	
	@Bean
	public Student getSecondStudent5() {
		Student s5=new Student(5,"govind",410);
		
		
		return s5;
	}
}
