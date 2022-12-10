package com.usecases;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.model.Student;

import java.util.Scanner;

public class EnrollStudentUseCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll: ");
        int roll = sc.nextInt();

        System.out.println("Enter Course_id: ");
        int cid = sc.nextInt();

        StudentDao dao = new StudentDaoImpl();

        try {
        String result = dao.enrollStudentInCourse(roll, cid);

            System.out.println(result);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
