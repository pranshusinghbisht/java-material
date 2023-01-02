package com.masai.usercase;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.model.Person;
import com.masai.utility.DbUtil2;

public class Demo {

	public static void main(String[] args) {


		EntityManager em=DbUtil2.provideEntityManager();
		
		Person person=new Person();
		person.setName("ravi");
	
		
		Employee e1=new Employee(new Address("MH", "phawwwni","431401"),new Address("KR","xxalore","789456"),80000);
		e1.setName("varsha");
		
		Employee e2=new Employee(new Address("MH", "ndded","431606"),new Address("KR","aaagalore","789456"),70000);
		e2.setName("geeta");
		
		Employee e3=new Employee(new Address("MH", "vasxa","431756"),new Address("MH","pxxe","484456"),75000);
		e3.setName("poonam");
		
		Employee e4=new Employee(new Address("MH", "beed","431441"),new Address("DL","dexzai","745612"),85000);
		e4.setName("ashu");
		
		

		
		
		em.getTransaction().begin();
		
		em.persist(person);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		
		em.getTransaction().commit();
		
		System.out.println("done....");
		em.close();

	}

}
