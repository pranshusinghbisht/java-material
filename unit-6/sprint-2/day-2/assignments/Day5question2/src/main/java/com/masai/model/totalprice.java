package com.masai.model;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.utility.EMUtil;

public class totalprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "select sum(price) from product";
		
		TypedQuery<Long> q=em.createQuery(jpql,Long.class);
		
		long result= q.getSingleResult();
		
		System.out.println(result);

	}

}
