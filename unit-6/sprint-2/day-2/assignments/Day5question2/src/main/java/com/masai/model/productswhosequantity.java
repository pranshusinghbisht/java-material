package com.masai.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.query.Query;

import com.masai.utility.EMUtil;

public class productswhosequantity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "select productId,productName,price from product where quantity<5";
		
		Query q= (Query) em.createQuery(jpql);

	
	
	 	List<Object[]> results= q.getResultList();
	 
	 	for(Object[] or: results) {
	 		int id= (Integer)or[0];
	 		 String name= (String)or[1];
	 		 int balance= (Integer)or[2];
	 		System.out.println("Name is "+id);
	 		 System.out.println("Name is "+name);
	 		 System.out.println("Balance is :"+balance);
	 		 
	 		System.out.println("===========================");
	 	}
	}

}
