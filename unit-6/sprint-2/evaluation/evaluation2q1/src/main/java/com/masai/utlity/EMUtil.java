package com.masai.utlity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("evaluation-unit");
    }

    public static EntityManager provideEM() {
        return emf.createEntityManager();
    }
}
