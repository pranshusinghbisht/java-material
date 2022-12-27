package com.practice.usecases.GetBulkData;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class GetSingleEmployeeData {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select e from Employee e where e.name='Ram'";

//        Query q = em.createQuery(jpql); instead of this (to avoid downcasting)
        TypedQuery<Employee> q = em.createQuery(jpql,Employee.class);

        Employee employee = q.getSingleResult();
        System.out.println(employee);


        // for single record we use ----> Object obj = q.getSingleResult
        // Object obj = q.getSingleResult();
        //Account acc = (Account)obj;



        em.close();


    }
}
