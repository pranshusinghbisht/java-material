package com.masai.UseCase;

import java.util.Scanner;

import com.masai.Dao.CourseDAO;
import com.masai.Dao.CourseDAOImpl;

public class AssignTeacherWithCourse {
	
	public static void main(String[] args) throws Exception{
	
		  Scanner sc = new Scanner(System.in);
	        CourseDAO dao = new CourseDAOImpl();
	        
	        System.out.println("Enter Teacher id:");
	        int tid = sc.nextInt();
	        System.out.println("Enter course id:");
	        int cid = sc.nextInt();
	        
	 
	        dao.assignTeacherWithCourse(tid,cid);
	        
	        
	        
		
	}

}
