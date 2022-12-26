package com.masai.usecases;

import com.masai.dao.EmpDao;
import com.masai.dao.EmpDaoImpl;

import java.util.Scanner;

public class DeleteEmployee {
    public static void main(String[] args) {

        EmpDao dao = new EmpDaoImpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID : ");
        int id = sc.nextInt();

        boolean val = dao.deleteEmployee(id);

        if (val) {
            System.out.println("Deleted Sucessfully...");
        } else {
            System.out.println("Not Deleted..");
        }

    }
}
