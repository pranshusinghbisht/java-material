package com.practice.usecase;

import com.practice.model.Department;
import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;

public class Main_unidirectional {


    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();
        Department d1=new Department();
        d1.setDname("Sales");
        d1.setLocation("kolkata");




        Employee emp = new Employee();
        emp.setName("Ram");
        emp.setSalary(8500);

        d1.setEmp(emp);

        em.getTransaction().begin();

        em.persist(d1);

        em.getTransaction().commit();

    }
}
