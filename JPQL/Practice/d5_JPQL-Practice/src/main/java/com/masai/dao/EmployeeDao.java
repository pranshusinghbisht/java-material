package com.masai.dao;

import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

import java.util.List;

public interface EmployeeDao {

   List<Employee> getAllEmployees() throws EmployeeException;
   List<Employee> getEmployeesByAddress(String address) throws EmployeeException;
   List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException;
    Object[] getEmployeeNameAndSalary(int empId)throws EmployeeException;
    public int getEmployeeSalaryById(int empId)throws EmployeeException;

}
