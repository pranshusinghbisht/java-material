package com.masai.usecases;

import com.masai.dao.EmpDao;
import com.masai.dao.EmpDaoImpl;
import com.masai.model.Employee;

import java.util.Scanner;

public class SaveEmployee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.next();

        System.out.println("Enter address");
        String address = sc.next();

        System.out.println("Enter Salary : ");
        int salary = sc.nextInt();

        EmpDao dao = new EmpDaoImpl();

        Employee employee = new Employee();
        employee.setName(name);
        employee.setAddress(address);
        employee.setSalary(salary);

        dao.save(employee);
    }
}
