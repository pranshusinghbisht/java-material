package com.practice.usecases;

import com.practice.EMUtil;
import com.practice.model.Department;
import com.practice.model.Employee;

import javax.persistence.EntityManager;

public class Persist {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        Department d1 = new Department();
        d1.setDname("sales");
        d1.setLocation("Kolkata");

        Department d2 = new Department();
        d2.setDname("Marketing");
        d2.setLocation("Lucknow");

        //creating employee without department
        Employee emp1 = new Employee();
        emp1.setName("Ram");
        emp1.setSalary(1200);

        Employee emp2 = new Employee();
        emp2.setName("Dinesh");
        emp2.setSalary(7500);

        //associating department with both employees(Ram, dinesh) with dept sales
        emp1.getDeptList().add(d1);
        emp2.getDeptList().add(d2);

        //associationg dept(sales) with both emp1 and emp2
        d1.getEmps().add(emp1);
        d1.getEmps().add(emp2);

        //assuming dinesh working in 2 dept(sales and marketing)
        emp2.getDeptList().add(d2);
        d2.getEmps().add(emp2);

        em.getTransaction().begin();

        em.persist(d1);
        em.persist(d2);

        em.getTransaction().commit();
        System.out.println("done...");
    }
}
