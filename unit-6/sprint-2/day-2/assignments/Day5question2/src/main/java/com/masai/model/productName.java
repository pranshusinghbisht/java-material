package com.masai.model;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;

import com.masai.utility.EMUtil;



public class productName {
	
	
public static void main(String[]arg) {
	
	EntityManager em= EMUtil.provideEntityManager();
	
	String jpql= "select productName,quantity from product";
	
	Query q= (Query) em.createQuery(jpql);



 	List<Object[]> results= q.getResultList();
 
 	for(Object[] or: results) {
 		
 		 String name= (String)or[0];
 		 int quantity= (Integer)or[1];
 		
 		 System.out.println("Name is "+name);
 		 System.out.println("Balance is :"+quantity);
 		 
 		System.out.println("===========================");
 	}
}
}
