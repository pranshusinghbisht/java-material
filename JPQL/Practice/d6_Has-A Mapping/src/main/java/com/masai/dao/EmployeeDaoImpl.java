package com.masai.dao;

import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public List<Employee> getAllEmployees() throws EmployeeException {

        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select e from Employee e";

        Query q = em.createQuery(jpql);

        List<Employee> employees = q.getResultList();

        return employees;
    }

    @Override
    public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {

        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select e from Employee e where e.address =:n";

        Query q = em.createQuery(jpql);

        q.setParameter("n",address);

        List<Employee> employees = q.getResultList();

        return employees;
    }

    @Override
    public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {

        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select e from Employee e where e.salary BETWEEN : m AND : n";

        Query q = em.createQuery(jpql);

        q.setParameter("m",startSalary);
        q.setParameter("n",endSalary);

        List<Employee> employees = q.getResultList();

        return employees;
    }

    @Override
    public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select name, address from Employee where empId=:id";

        TypedQuery<Object[]> q = em.createQuery(jpql,Object[].class);

        q.setParameter("id",empId);

        Object[] result = q.getSingleResult();
        em.close();

            return result;

    }

    @Override
    public int getEmployeeSalaryById(int empId) throws EmployeeException {

        EntityManager em = EMUtil.provideEntityManager();

        String jpql = "select  e.salary from Employee e where e.empId=:id";

        Query q = em.createQuery(jpql);

         q.setParameter("id",empId);

         int salary = (int) q.getSingleResult();

        return salary;
    }
}
