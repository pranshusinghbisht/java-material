package com.masai.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Employee.Employee;
import Employee.EmployeeException;

public class EmployeeDaoImp implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		
		
EntityManagerFactory emf= Persistence.createEntityManagerFactory("employeeUnit");
		
		
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		em.getTransaction().commit();
		
		
		System.out.println("employee registered successfully");
		
		
		
		
		em.close();
		return null;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
EntityManagerFactory emf= Persistence.createEntityManagerFactory("employeeUnit");
		
		
		EntityManager em= emf.createEntityManager();
		
Employee employee= em.find(Employee.class,empId);
		
		if(employee != null)
		return employee;
		
		em.close();
	
		
		System.out.println("Employee not found");
		
		return null;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		
EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		
		EntityManager em= emf.createEntityManager();
		
	
		Employee employee= em.find(Employee.class,empId);
		
		if(employee != null){
			
			em.getTransaction().begin();
			
			em.remove(employee);
			
			em.getTransaction().commit();
			
			
			System.out.println("Employee removed....");
			
		}else {
			System.out.println("Employee not found...");
			
		}
		
		em.close();
		
		
		System.out.println("done");

		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeUnit");
		
		EntityManager em= emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		em.merge(employee);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		System.out.println("Updated Successfully...");
		
		return null;
	}
	
	

}
