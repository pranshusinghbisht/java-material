package com.masai.dao;

import com.masai.model.Employee;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class EmpDaoImpl implements EmpDao{
    @Override
    public void save(Employee emp) {
       EntityManager em = EMUtil.provideEntityManager();

       em.getTransaction().begin();

       em.persist(emp);

       em.getTransaction().commit();

        System.out.println("Saved...");

       em.close();

    }

    @Override
    public String getAddressOfEmployee(int empId) {

        String msg = "";

        EntityManager em = EMUtil.provideEntityManager();

        Employee employee = em.find(Employee.class,empId);

        msg = "found...";
        System.out.println(employee.toString());

        em.close();

        return msg;
    }

    @Override
    public String giveBonusToEmployee(int empId, int bonus) {

        String msg = "Not Added...";

        EntityManager em = EMUtil.provideEntityManager();

        Employee emp = em.find(Employee.class,empId);

        if(emp == null){
           throw new IllegalArgumentException("Invalid Account");
        }
        else {
            em.getTransaction().begin();

            emp.setSalary(emp.getSalary()+bonus);

            em.getTransaction().commit();
            msg = "Added..";

            em.close();
        }

        return msg;
    }

    @Override
    public boolean deleteEmployee(int empId) {
        boolean b = false;
        EntityManager em = EMUtil.provideEntityManager();

        Employee emp = em.find(Employee.class,empId);

        if(emp == null){
            throw new IllegalArgumentException("Invalid Account");
        }
        else {
            em.getTransaction().begin();
            em.remove(emp);
            em.getTransaction().commit();
            b = true;
            em.close();
        }


        return b;
    }
}
