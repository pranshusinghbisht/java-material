package com.masai.usercase;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.utility.DbUtil2;

public class Demo3 {

	public static void main(String[] args) {
		
		EntityManager em=DbUtil2.provideEntityManager();
		
		Student student=em.find(Student.class,2);
		
		
		List<Course> courses=student.getCourses();
		
		
		for(Course c:courses) {
			
			System.out.println(c);
		}

	}

}
