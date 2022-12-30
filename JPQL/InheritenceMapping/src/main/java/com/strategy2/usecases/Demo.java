package com.strategy2.usecases;

import com.utility.EMUtil;
import com.strategy2.model.ContractualEmployee;
import com.strategy2.model.Employee;
import com.strategy2.model.SalaryEmployee;

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
