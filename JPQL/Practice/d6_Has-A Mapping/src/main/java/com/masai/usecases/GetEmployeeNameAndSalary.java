package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;

import java.util.Scanner;

public class GetEmployeeNameAndSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id to getting name and salary : ");
        int id = sc.nextInt();

        EmployeeDao dao = new EmployeeDaoImpl();
        try {
            Object[] obj = dao.getEmployeeNameAndSalary(id);
                System.out.println("Name : "+obj[0]);
                System.out.println("Salary : "+obj[1]);


        } catch (EmployeeException e) {
            throw new RuntimeException(e);
        }

    }
}
