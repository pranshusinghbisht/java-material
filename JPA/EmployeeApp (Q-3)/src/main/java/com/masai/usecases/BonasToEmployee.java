package com.masai.usecases;

import com.masai.dao.EmpDao;
import com.masai.dao.EmpDaoImpl;

import java.util.Scanner;

public class BonasToEmployee {
    public static void main(String[] args) {

        EmpDao dao = new EmpDaoImpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID : ");
        int id = sc.nextInt();
        System.out.println("Enter Bonas Amount : ");
        int bonas = sc.nextInt();

        String str = dao.giveBonusToEmployee(id,bonas);

        System.out.println(str);





    }
}
