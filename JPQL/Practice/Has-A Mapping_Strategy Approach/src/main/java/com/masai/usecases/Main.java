package com.masai.usecases;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        Employee employee1 = new Employee();
        employee1.setName("Ram");
        employee1.setGender("Male");
        employee1.setSalary(2800);

        Employee employee2 = new Employee();
        employee2.setName("shyam");
        employee2.setGender("Male");
        employee2.setSalary(2509);

        Employee employee3 = new Employee();
        employee3.setName("Kiran");
        employee3.setGender("Female");
        employee3.setSalary(2400);

        Employee employee4 = new Employee();
        employee4.setName("BalRam");
        employee4.setGender("Male");
        employee4.setSalary(2500);


        employee1.getEmpAddress().add(new Address("Mh", "Pune", "787887","home"));
        employee1.getEmpAddress().add(new Address("MP", "Indore", "584542","office"));

        employee2.getEmpAddress().add(new Address("re", "Lucknow", "78787","home"));
        employee2.getEmpAddress().add(new Address("re", "Indore", "583542","office"));

        employee3.getEmpAddress().add(new Address("yu", "Delhi", "787887","home"));
        employee3.getEmpAddress().add(new Address("yu", "Amritsar", "584542","office"));

        employee4.getEmpAddress().add(new Address("we", "Dehradun", "78787","home"));
        employee4.getEmpAddress().add(new Address("we", "Pithoragarg", "58542","office"));


        em.getTransaction().begin();
        em.persist(employee1);
        em.persist(employee2);

        em.persist(employee3);
        em.persist(employee4);

        em.getTransaction().commit();
        System.out.println("Done");
        em.close();

    }
}
