package com.practice.usecases.UpdateBulkData;

import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UsingNamedParameter {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "update Employee set salary = salary +:sal where name= :nm"; // take number as a consecutive manner

        Query q = em.createQuery(jpql);

        q.setParameter("sal",2000);
        q.setParameter("nm","Rohan");

        em.getTransaction().begin();
        int x = q.executeUpdate();
        em.getTransaction().commit();
        System.out.println(x+" record updated...");
        em.close();
    }
}
