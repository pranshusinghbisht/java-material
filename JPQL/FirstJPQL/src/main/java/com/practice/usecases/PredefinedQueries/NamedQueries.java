package com.practice.usecases.PredefinedQueries;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class NamedQueries {

/*
--if we require to write same query again and again in multiple Data
    access layer classes, it is recomended to use NamedQuery,

--in which we centralize the query with a unique name inside the Entity class.

    and refer that name in all the Data access layer classes.

*/

//    @NamedQuery(name = "account.getBalance",query = "from Account where balance <:bal")



    public static void main(String[] args) {

        // 3 or 4 very large query
        //10, 20
        EntityManager em = EMUtil.provideEntityManager();

        Query q = em.createNamedQuery("employee.getSalary");
        q.setParameter("sal",5000);

        List<Employee> list= q.getResultList();

        list.forEach(a -> System.out.println(a));

        em.close();
    }
}
