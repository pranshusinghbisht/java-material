package com.practice.usecases.oneToMany_uniDirectional;

import com.practice.model.Department;
import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;

public class Demo {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        Department dept = new Department();
        dept.setDname("Sales");
        dept.setLocation("Mumbai");


        Employee emp1 = new Employee();
        emp1.setName("Shyam");
        emp1.setSalary(140);
        emp1.setDept(dept);

        Employee emp2 = new Employee();
        emp2.setName("Ram");
        emp2.setSalary(700);
        emp2.setDept(dept);


        em.getTransaction().begin();
        em.persist(emp1);
        em.persist(emp2);

        em.getTransaction().commit();
        em.close();
        System.out.println("Done...");
    }
}
