package com.strategy1.usecases;

import com.strategy1.model.ContractualEmployee;
import com.strategy1.model.Employee;
import com.strategy1.model.SalaryEmployee;
import com.utility.EMUtil;

import javax.persistence.EntityManager;

public class Demo {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        Employee emp = new Employee();
        emp.setName("Pranshu");


        SalaryEmployee semp = new SalaryEmployee();
        semp.setName("Hari");
        semp.setSalary(7500);

        ContractualEmployee cemp = new ContractualEmployee();
        cemp.setName("Hari");
        cemp.setCostPerDay(3000);
        cemp.setNoOfWorkingDays(10);

        em.getTransaction().begin();
        em.persist(emp);
        em.persist(semp);
        em.persist(cemp);
        em.getTransaction().commit();

        System.out.println("Done...");

    }
}
