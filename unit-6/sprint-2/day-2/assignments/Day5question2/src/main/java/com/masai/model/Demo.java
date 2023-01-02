package com.masai.model;

import javax.persistence.EntityManager;

import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
	
		EntityManager em= EMUtil.provideEntityManager();
	
		product p1 = new product("rice",130,5);
		product p2 = new product("wheat",100,3);
		product p3 = new product("oil",300,2);
		product p4 = new product("pluses",300,6);
		product p5 = new product("vegetables",230,1);
		
		
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		
		em.getTransaction().commit();
		
		
		System.out.println("done");
		
		
		
		em.close();
	}

}
