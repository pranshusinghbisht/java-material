package com.practice.usecases.SelectSomeFromRowAndColumn;

import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Row1andColumn1 {
    public static void main(String[] args) {

        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select e.name from Employee e where e.empId =:id ";

        TypedQuery<String> q = em.createQuery(jpql,String.class);

        q.setParameter("id",4);

        String name = q.getSingleResult();
        System.out.println("Name is : "+name);
        em.close();
    }
}
