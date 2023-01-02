package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;

import java.util.Scanner;

public class GetEmployeeSalaryById {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Id to get Salary : ");
        int id = sc.nextInt();

        EmployeeDao dao = new EmployeeDaoImpl();
        try {
            int salary =  dao.getEmployeeSalaryById(id);
            System.out.println(salary);
        } catch (EmployeeException e) {
            throw new RuntimeException(e);
        }
    }
}
