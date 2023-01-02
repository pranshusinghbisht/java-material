package com.masai.usercase;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.utility.DbUtil2;

public class Demo2 {

	public static void main(String[] args) {


		EntityManager em=DbUtil2.provideEntityManager();
		
		
		Course course= em.find(Course.class, 1);
		
	List<Student> students=course.getStudents();
	
	for(Student s:students) {
		
		System.out.println(s);
	}

	}

}
