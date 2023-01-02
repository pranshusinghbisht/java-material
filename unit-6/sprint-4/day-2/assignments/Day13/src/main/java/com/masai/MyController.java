package com.masai;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/emp")
	public Employee sendEmp() {
		Employee em=new Employee(1,"Sumedh","Akola",956120);
		return em;
	}
	@RequestMapping("/Wellcome")
	public  String ss() {
		return "Welcome to Spring Boot World";
	}
	
	@RequestMapping("/All")
	public List<Employee> sendEmpList() {
		Employee em1=new Employee(1,"Sumedh","Akola",12345);
		Employee em2=new Employee(2,"Gopal","Amravti",54321);
		Employee em3=new Employee(3,"Pravin","Wardha",67890);
		Employee em4=new Employee(4,"Prashik","Nagpur",987650);
		Employee em5=new Employee(5,"Vikram","Washim",234567);
		List<Employee> le=new ArrayList<>();
		
		le.add(em1);
		le.add(em2);
		le.add(em3);
		le.add(em4);
		le.add(em5);
		
		return le;
		
		
	}

}

