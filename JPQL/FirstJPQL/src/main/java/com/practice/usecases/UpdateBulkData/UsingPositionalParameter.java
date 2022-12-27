package com.practice.usecases.UpdateBulkData;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UsingPositionalParameter {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "update Employee set salary = salary +?5 where name= ?6"; // take number as a consecutive manner

        Query q = em.createQuery(jpql);

        q.setParameter(5,1000);
        q.setParameter(6,"Ram");

        em.getTransaction().begin();
        int x = q.executeUpdate();
        em.getTransaction().commit();
        System.out.println(x+" record  updated...");
        em.close();
        em.close();
    }
}
