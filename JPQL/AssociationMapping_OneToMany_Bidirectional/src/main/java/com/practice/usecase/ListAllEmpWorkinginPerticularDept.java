package com.practice.usecase;

import com.practice.model.Department;
import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ListAllEmpWorkinginPerticularDept {
    public static void main(String[] args) {




        EntityManager em=EMUtil.provideEntityManager();

        Department d= em.find(Department.class, 1);

        List<Employee> emps= d.getEmps();

        emps.forEach(e ->{

            System.out.println(e.getEmpId());
            System.out.println(e.getName());
            System.out.println(e.getSalary());
            System.out.println("=========================================================");

        });

        System.out.println("done...");




    }

}
