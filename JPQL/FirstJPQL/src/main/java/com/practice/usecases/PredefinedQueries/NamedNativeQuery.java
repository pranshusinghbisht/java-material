package com.practice.usecases.PredefinedQueries;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class NamedNativeQuery {

//    --Native queries are not recomended to use in realtime application developement.

// @NamedNativeQuery(name="allAccount" ,query = "select * from account",resultClass=Account.class)

    public static void main(String[] args) {

        EntityManager em= EMUtil.provideEntityManager();

        Query q= em.createNamedQuery("allEmployee" );

        List<Employee> list= q.getResultList();

        list.forEach(a -> System.out.println(a));
    }

}



