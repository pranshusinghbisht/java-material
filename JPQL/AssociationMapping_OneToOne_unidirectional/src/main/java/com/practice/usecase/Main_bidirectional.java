package com.practice.usecase;

import com.practice.model_bidirectional.Department;
import com.practice.model_bidirectional.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;

public class Main_bidirectional {
    public static void main(String[] args) {
        // here on both side define opposite

        EntityManager em = EMUtil.provideEntityManager();
        Department d1=new Department();
        d1.setDname("Sales");
        d1.setLocation("kolkata");


        Employee emp = new Employee();
        emp.setName("Ram");
        emp.setSalary(8500);

        d1.setEmp(emp);
        emp.setDept(d1);


        em.getTransaction().begin();
        em.persist(d1);
        em.getTransaction().commit();

        System.out.println("done..");


    }
}
