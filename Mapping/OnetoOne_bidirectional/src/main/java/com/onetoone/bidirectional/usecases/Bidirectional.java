package com.onetoone.bidirectional.usecases;

import com.onetoone.bidirectional.utility.EMUtil;

import javax.persistence.EntityManager;

public class Bidirectional {
    public static void main(String[] args) {

      EntityManager em = EMUtil.provideEntityManager();



      em.getTransaction().begin();
      em.getTransaction().commit();
      em.close();
    }
}
