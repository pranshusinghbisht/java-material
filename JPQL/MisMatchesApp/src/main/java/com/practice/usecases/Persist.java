package com.practice.usecases;

import com.practice.model.Address;
import com.practice.model.Employe;
import com.practice.utility.EMUtil;
import javax.persistence.EntityManager;

public class Persist {

    public static void main(String[] args) {
       EntityManager em = EMUtil.provideEntityManager();

        Employe employe = new Employe();
        employe.setEname("Ram");
        employe.setSalary(2500);
//        employe.setHomeAddress(new Address("UP","Lucknow","226025"));
//        employe.setOfficeAddress(new Address("UK","london","885252"));

        employe.getAddresses().add(new Address("Mh", "Pune", "787887"));
        employe.getAddresses().add(new Address("MP", "Indore", "584542"));




        em.getTransaction().begin();
        em.persist(employe);
        em.getTransaction().commit();
        System.out.println("Done");
        em.close();


    }
}
