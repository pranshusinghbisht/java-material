package com.practice.usecases.oneToMany_uniDirectional;

import com.practice.model.Department;
import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;

public class Demo1 {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

     Department department =    em.find(Department.class,1);

        Employee employee = new Employee();
        employee.setName("Mukesh");
        employee.setSalary(705020);

        em.getTransaction().begin();
        department.getEmps().add(employee);
        em.getTransaction().commit();
        System.out.println("Done...");
        em.close();

    }
    }
