package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

import java.util.List;
import java.util.Scanner;

public class GetEmployeeByAddress {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Address to get Employee : ");
        String address = sc.next();

        EmployeeDao dao = new EmployeeDaoImpl();
        try {
            List<Employee> employees = dao.getEmployeesByAddress(address);
            if(employees.isEmpty()){
                System.out.println("Employee Not Found...");
            }else{
                employees.forEach(emp -> System.out.println(emp));
            }
        } catch (EmployeeException e) {
            throw new RuntimeException(e);
        }

    }
}
