package com.masai.entities;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Demo implements EmployeeDao{


	 public void save(Employee emp) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();;
		
		System.out.println("Done the emplyee is added");
		em.close();
		
	}

	public  String getAddressOfEmployee(int empId) {
		String message ="there is not employee availble";
		
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em= emf.createEntityManager();
		
		Employee employee=em.find(Employee.class, empId);
		
		if(employee!=null) {
			return employee.getAddress();
		}
		message=("Employee does not exist");
		
		em.close();
	return message;

		
		
		
	}

	public  String giveBonusToEmployee(int empId, int bonus) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em= emf.createEntityManager();
		String message="invlaid employee id";
		Employee emp=em.find(Employee.class, empId);
		
		if(emp==null) {
			System.out.println("Employee does not exist");
			
		}else {
			em.getTransaction().begin();
			emp.setSalary(emp.getSalary()+bonus);
			em.getTransaction().commit();
			
	   message="Salary is increased";
	   return message;
		}
		return message;
	}

	public  boolean deleteEmployee(int empId) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em= emf.createEntityManager();
		
		Employee emp=em.find(Employee.class, empId);
		 boolean res=false;
		if(emp!=null) {
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			 res=true;
			return res;
		}
		
		return res;
		
		
		
	}

}
