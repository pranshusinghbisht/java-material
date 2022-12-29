package com.practice.usecases.oneToMany_uniDirectional;

import com.practice.model.Department;
import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;

public class Demo {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        Employee emp1 = new Employee();
        emp1.setName("Rohit");
        emp1.setSalary(140);

        Employee emp2 = new Employee();
        emp2.setName("Sakshi");
        emp2.setSalary(700);

        Department dept = new Department();
        dept.setDname("HR");
        dept.setLocation("Mombai");

        //associationg both employee with a dept obj
        dept.getEmps().add(emp1);
        dept.getEmps().add(emp2);

        em.getTransaction().begin();
//        em.persist(emp1);
//        em.persist(emp2);
        em.persist(dept);

        em.getTransaction().commit();
        em.close();
        System.out.println("Done...");
    }
}
