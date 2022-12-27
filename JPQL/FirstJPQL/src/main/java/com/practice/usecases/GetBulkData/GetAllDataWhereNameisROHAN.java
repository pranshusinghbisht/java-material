package com.practice.usecases.GetBulkData;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class GetAllDataWhereNameisROHAN {
    public static void main(String[] args) {

        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select e from Employee e where e.name='Rohan'";

        Query q = em.createQuery(jpql);

        // for single record we use

        List<Employee> employees = q.getResultList();

        employees.forEach(emp -> System.out.println(emp));

        em.close();


    }

}
