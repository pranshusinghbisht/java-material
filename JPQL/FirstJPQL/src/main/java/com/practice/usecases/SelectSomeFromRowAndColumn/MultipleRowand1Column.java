package com.practice.usecases.SelectSomeFromRowAndColumn;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Index;
import javax.persistence.TypedQuery;
import java.util.List;

public class MultipleRowand1Column {
        public static void main(String[] args){
            EntityManager em = EMUtil.provideEntityManager();

            String jpql = "select e.salary from Employee e";

            TypedQuery<Integer> q = em.createQuery(jpql,Integer.class);

            List<Integer> salaries = q.getResultList();
            salaries.forEach(sal -> System.out.println(sal));

            em.close();
    }
}
