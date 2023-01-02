package com.masai.UseCase;

import java.util.Scanner;

import com.masai.Dao.CourseDAO;
import com.masai.Dao.CourseDAOImpl;
import com.masai.Model.Student;

public class RegisterStudent {
	
	public static void main(String[]args) throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
        CourseDAO dao = new CourseDAOImpl();
        System.out.println("Enter the Student details");
        Student stu = new Student();
        System.out.println("Enter the Student Name");
        stu.setName(sc.next());
        System.out.println("Enter the Student mobile no.:");
        stu.setMobile(sc.next());
        System.out.println("Enter the Student email: ");
        stu.setEmail(sc.next());
        System.out.println("Enter the Course id:");
        int courseId = sc.nextInt();
         
        dao.registerStudent(stu,courseId);
        
sc.close();
	}

}
