package com.practice.usecases.SelectSomeFromRowAndColumn;

import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class FewColumnWithSingleRecord {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select salary, empId from Employee where name=:name";

//        Query q = em.createQuery(jpql); //*

        TypedQuery<Object[]> q = em.createQuery(jpql,Object[].class);

        q.setParameter("name","Ram");

//      Multiple

//        List<Object[]> result = q.getResultList();
//        for(Object[] or:result){
//            Integer salary = (Integer)or[0];
//            Integer empId = (Integer)or[1];
//
//            System.out.println("salary is : "+salary);
//            System.out.println("emp id : "+empId);
//
//            System.out.println("===========================================");
//
//
//
//        }







        //single

//    Object obj = q.getSingleResult(); //*
//    Object[] result = (Object[])obj;  //*

Object[] result = q.getSingleResult();

        System.out.println("Salary is "+(Integer)result[0]);
        System.out.println("EmpId is "+(Integer)result[1]);




        em.close();
    }
}
