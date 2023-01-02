package com.masai.entities;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose the option -\n"+"1. Save\n"+"2. getaddress\n"
												+"3. Update salary\n"+"4. delete employee\n");
		
		
		
		System.out.println();
		System.out.println("Enter the above choice ");
		
		System.out.println("Enter the choice");
		
		int choice=sc.nextInt();
		
		EmployeeDao ed=new Demo();
		
		if(choice==1) {
			
			System.out.println("Enter the employee id to register");
			int empid=sc.nextInt();
			
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the address");
			
			String address=sc.next();
			
			System.out.println("Enter the salary");
			
			int salary=sc.nextInt();
			
			Employee emp=new Employee(empid,name,address,salary);
			
			ed.save(emp);
			
		}else if(choice==2) {
			
			System.out.println("Enter the empid");
		int empId=	sc.nextInt();
		
		ed.getAddressOfEmployee(empId);
	
			
		}else if(choice==3) {
			
			System.out.println("Enter the employee id");
			int empId=sc.nextInt();
			System.out.println("Enter the bonus");
			int bonus=sc.nextInt();
	        ed.giveBonusToEmployee(empId,bonus);
		}else if(choice==4) {
			
			System.out.println("Enter the id");
			int empId=sc.nextInt();
			
		ed.deleteEmployee(empId);

			
		}else {
			System.out.println("Enter the correct one");
			
	   Main.main(args);
		}
		
	}

}
