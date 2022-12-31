package com.onetoone.unidirectional.usecases;

import com.onetoone.unidirectional.utility.EMUtil;

import javax.persistence.EntityManager;

public class Unidirectional {
    public static void main(String[] args) {
      EntityManager em = EMUtil.provideEntityManager();
      em.getTransaction().begin();
      em.getTransaction().commit();
      em.close();
    }
}
