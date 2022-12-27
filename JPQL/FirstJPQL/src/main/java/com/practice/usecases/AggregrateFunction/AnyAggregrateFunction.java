package com.practice.usecases.AggregrateFunction;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class AnyAggregrateFunction {
    //min,max, count : Integer
    //    avg: Double
    //    sum: Long

    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select sum(e.salary) from Employee e";

        TypedQuery<Long> q = em.createQuery(jpql, Long.class);

        long result = q.getSingleResult();

        System.out.println(result);
        em.close();
    }
}
