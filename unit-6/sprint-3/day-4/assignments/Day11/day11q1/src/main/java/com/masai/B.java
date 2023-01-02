package com.masai;

	import java.util.List;
	import javax.annotation.PostConstruct;
	import javax.annotation.PreDestroy;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;


	@Component
	public class B{


	private List<String> cities;

	private List<Student> students;

	@Autowired
	public void setCities(List<String> cities) {
		this.cities = cities;
	}



	@Autowired
	public void setStudents(List<Student> students) {
		this.students = students;
	}



	@PostConstruct
	public void setUp() {
		
		System.out.println("inside setup method");
		
	}



	@PreDestroy
	public void destroy() {
		
		System.out.println("inside destroy method");
	}




	public void showResult() {
		
		System.out.println(cities);

		

		for(Student s:students) {
			
			System.out.println(s);
		}
	}

	}



