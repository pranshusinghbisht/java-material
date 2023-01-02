package com.interfaces;

import java.nio.channels.AcceptPendingException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.beanclass.Account;

public class demo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em  = emt.createEntityManager();
		
		
		
		Account ac   = em.find(Account.class,12 );
		
		System.out.println(ac);
		
		
		
		
	}

}
