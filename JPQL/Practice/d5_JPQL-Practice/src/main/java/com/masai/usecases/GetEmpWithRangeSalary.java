package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

import java.util.List;
import java.util.Scanner;

public class GetEmpWithRangeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Minimum Salary for getting range : ");
        int min = sc.nextInt();

        System.out.print("Enter Maximum Salary for getting range : ");
        int max = sc.nextInt();

        EmployeeDao dao = new EmployeeDaoImpl();

        try {
         List<Employee> employees = dao.getAllEmployeeWithRangeSalary(min,max);
         if(employees.isEmpty()){
             System.out.println("Employees Not Found...");
         }else {
             employees.forEach(emp -> System.out.println(emp));
         }
        } catch (EmployeeException e) {
            throw new RuntimeException(e);
        }
    }
}
