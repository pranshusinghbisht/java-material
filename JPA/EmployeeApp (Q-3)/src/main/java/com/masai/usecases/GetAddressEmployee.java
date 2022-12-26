package com.masai.usecases;

import com.masai.dao.EmpDao;
import com.masai.dao.EmpDaoImpl;

import java.util.Scanner;

public class GetAddressEmployee {
    public static void main(String[] args) {
        EmpDao dao = new EmpDaoImpl();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        int id = sc.nextInt();

        dao.getAddressOfEmployee(id);

    }
}
