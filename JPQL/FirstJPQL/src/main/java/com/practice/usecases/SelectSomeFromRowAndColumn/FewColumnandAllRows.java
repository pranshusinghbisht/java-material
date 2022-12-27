package com.practice.usecases.SelectSomeFromRowAndColumn;

import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Objects;

public class FewColumnandAllRows {
    public static void main(String[] args){
        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select e.salary, e.empId from Employee e";

        Query q = em.createQuery(jpql);

        List<Object[]> result = q.getResultList();
        for(Object[] or:result){
            Integer salary = (Integer)or[0];
            Integer empId = (Integer)or[1];

            System.out.println("salary is : "+salary);
            System.out.println("emp id : "+empId);

            System.out.println("===========================================");



        }
        em.close();
    }
}
