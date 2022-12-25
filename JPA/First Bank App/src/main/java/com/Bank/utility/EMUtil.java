package com.Bank.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("account-unit"); // Session manager

    }

    public static EntityManager provideEntityManager(){
        //i can create like this as well
/*
        EntityManager em = emf.createEntityManager();
        return em;
*/
        return emf.createEntityManager();
    }
}
