package com.practice.usecases.oneToMany_uniDirectional;

import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class GetAllEmployeeDromDepartmentHR {
    public static void main(String[] args) {


        EntityManager em= EMUtil.provideEntityManager();


        // Department is the entity class and emps is the variables
        String jpql= "select emps from Department where dname=:dn";



        Query q= em.createQuery(jpql);

        q.setParameter("dn","HR");

        List<Employee> allemps= q.getResultList();


//        System.out.println(allemps);

        allemps.forEach(emp -> System.out.println(emp));

        System.out.println("done...");



    }

}
