package com.masai.Main;

import java.util.Scanner;

import Employee.EmployeeException;
import Usecase.deleteEmployeeById;
import Usecase.getEmployeeById;
import Usecase.registerEmployee;
import Usecase.updateEmployee;

public class Main {

	public static void main(String[] args) throws EmployeeException {
		
		System.out.println("1: Register Employee");
		System.out.println("2: Find Employee By Id");
		System.out.println("3: Delete Employee By Id");
		System.out.println("4: Update Employee");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i==1) {
			registerEmployee.main(args);
			Main.main(args);
		}else if(i==2) {
			getEmployeeById.main(args);
			Main.main(args);
		}else if(i==3) {
			deleteEmployeeById.main(args);
			Main.main(args);
		}else if(i==4) {
			updateEmployee.main(args);
			Main.main(args);
			
		}else {
			System.out.println("Wrong Input");
			Main.main(args);
		}
		

	}

}
