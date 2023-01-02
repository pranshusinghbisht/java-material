package com.masai.usecase;

import com.masai.DAO.EmpDAO;
import com.masai.DAO.EmpDAOImpl;
import com.masai.Exceptions.DepartmentException;
import com.masai.Model.Department;

import java.util.Scanner;

public class GetDepartmentDetailsByEmployeeId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDAO dao = new EmpDAOImpl();
        System.out.println("Enter the Employee id: ");
        int empId = sc.nextInt();

        try {
            Department dpt = dao.getDepartmentDetailsByEmployeeId(empId);
            System.out.println(dpt);
            sc.close();
        }catch(DepartmentException de) {
            System.out.println(de.getMessage());
            sc.close();
        }
            sc.close();
        
    }
}
