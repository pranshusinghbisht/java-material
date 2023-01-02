package com.masai.UseCase;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.CourseDAO;
import com.masai.Dao.CourseDAOImpl;
import com.masai.Model.Student;

public class GetetAlltheStudentsByCourseName {
	
	public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        CourseDAO dao = new CourseDAOImpl();
        System.out.println("Enter Course name:");
        String cname = sc.next();
        List<Student> sList =dao.getAlltheStudentsByCourseName(cname);
        for(Student s: sList) {
            System.out.println(s);
        }
	}

}
