package com.practice.usecases.PredefinedQueries;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class NativeQueries {
//    --here we write the Query in the term of tables and their columns. (normal sql)

    public static void main(String[] args) {

        EntityManager em = EMUtil.provideEntityManager();
        String nq = "select * from employee"; // here employee is the table name
        Query q = em.createNativeQuery(nq, Employee.class);
        List<Employee> list = q.getResultList();

        list.forEach(a -> System.out.println(a));




    }
}
