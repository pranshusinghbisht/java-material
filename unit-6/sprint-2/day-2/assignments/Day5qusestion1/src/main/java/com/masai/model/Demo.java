package com.masai.model;

import javax.persistence.EntityManager;

import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
	
		EntityManager em= EMUtil.provideEntityManager();
		
		
		Customer emp = new Customer();
		
		emp.setName("Ram");
		emp.setEmail("ram");
		emp.setMobileNumber("999999");
		emp.getAddresses().add(new Address("St1", "C1", "p1","Home"));
		emp.getAddresses().add(new Address("St2", "C2", "p2","Office"));
		emp.getAddresses().add(new Address("St3", "C2", "p2","Office"));
		
		
Customer emp2 = new Customer();
		
		emp2.setName("shyam");
		emp2.setEmail("shyam");
		emp2.setMobileNumber("88888");
		emp2.getAddresses().add(new Address("St1", "C1", "p1","Home"));
		emp2.getAddresses().add(new Address("St2", "C2", "p2","Office"));
		emp2.getAddresses().add(new Address("St3", "C2", "p2","Office"));
		
		
		em.getTransaction().begin();
		
		em.persist(emp);
		em.persist(emp2);
		
		em.getTransaction().commit();
		
		
		System.out.println("done");
		
		
		
		em.close();
	}

}
