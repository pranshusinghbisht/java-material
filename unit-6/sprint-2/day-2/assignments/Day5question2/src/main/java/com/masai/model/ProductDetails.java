package com.masai.model;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.utility.EMUtil;

public class ProductDetails {
	
	public static void main(String[]args) {
		
		EntityManager em= EMUtil.provideEntityManager();
				
				
				
				String jpql= "from product where productId='1'";
				TypedQuery<product> q= em.createQuery(jpql,product.class);
				
				product acc= q.getSingleResult();
				
				System.out.println(acc);
			}

}
