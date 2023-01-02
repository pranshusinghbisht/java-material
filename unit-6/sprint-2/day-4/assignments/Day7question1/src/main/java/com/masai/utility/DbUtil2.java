package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbUtil2 {
	
	static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("personUnit");
	}
	
	public static EntityManager provideEntityManager() {
		
		EntityManager em=emf.createEntityManager();
		
		return em;
		
		
	}

}
