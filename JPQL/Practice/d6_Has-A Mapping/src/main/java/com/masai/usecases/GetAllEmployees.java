package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

import java.util.List;

public class GetAllEmployees {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDaoImpl();
        try {
            List<Employee> employees= dao.getAllEmployees();
            if(employees.isEmpty()){
                System.out.println("Empty Employees...");
            }else {
                employees.forEach(emp -> System.out.println(emp));
            }
        } catch (EmployeeException e) {
            throw new RuntimeException(e);
        }

    }
}
