package com.practice.usecase;

import com.practice.model.Department;
import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;

public class Demo {
    public static void main(String[] args) {

        EntityManager em=EMUtil.provideEntityManager();

        Department dept=new Department();
        dept.setDname("Marketing");
        dept.setLocation("Kolkata");

        Employee emp1=new Employee();
        emp1.setName("Sunil");
        emp1.setSalary(7800);
        emp1.setDept(dept); //associating dept with emp1

        Employee emp2=new Employee();
        emp2.setName("Suresh");
        emp2.setSalary(8800);
        emp2.setDept(dept); //associating dept with emp1

        //here both emp got the dept details

        //now we need to give both emp details to the dept
        //associating both emp with the dept

        dept.getEmps().add(emp1);
        dept.getEmps().add(emp2);


        em.getTransaction().begin();

        em.persist(dept);

        em.getTransaction().commit();

        em.close();
        System.out.println("Done...");
    }
}
