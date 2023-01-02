package com.masai.usercase;

import javax.persistence.EntityManager;

import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.utility.DbUtil2;

public class Demo1 {

	public static void main(String[] args) {

		
		EntityManager em=DbUtil2.provideEntityManager();

		 Course c1=new Course("asds","6 months",50000);	 
		 Course c2=new Course("asd","3 months",10000);
		 
		Student s1=new Student("asddx","abc@gmail.com","234423");
		Student s2=	new Student("sdwee","qwe@gmail.com","12345623");
		
		s1.getCourses().add(c1);
		s1.getCourses().add(c2);
		
		
	    
		s2.getCourses().add(c1);
		s2.getCourses().add(c2);
		
		
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		
		
		c2.getStudents().add(s1);
		c2.getStudents().add(s2);
		
		
		em.getTransaction().begin();
		
		em.persist(c1);
		em.persist(c2);
		
		em.getTransaction().commit();
		
		em.close();
		
		
		
		 

	}

}
