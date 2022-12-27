package com.practice.usecases.GetBulkData;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class GetAllEmployeeData {
    public static void main(String[] args) {

        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select e from Employee e";
        // from Employee

        Query q = em.createQuery(jpql);

        // for single record we use ----> Object obj = q.getSingleResult
        // Object obj = q.getSingleResult();
        //Account acc = (Account)obj;

       List<Employee> employees = q.getResultList();

        employees.forEach(emp -> System.out.println(emp));

        em.close();


    }
}
