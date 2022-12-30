package com.practice.usecases.oneToMany_uniDirectional;

import com.practice.model.Department;
import com.practice.model.Employee;
import com.practice.utility.EMUtil;

import javax.persistence.EntityManager;

public class GetDetailsOfDepartmentByEmployeeId {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        Employee emp = em.find(Employee.class,2);

        Department dept = emp.getDept();

        System.out.println(dept.getDeptId());
        System.out.println(dept.getDname());
        System.out.println(dept.getLocation());

        System.out.println("Done");

        em.close();

    }
}
