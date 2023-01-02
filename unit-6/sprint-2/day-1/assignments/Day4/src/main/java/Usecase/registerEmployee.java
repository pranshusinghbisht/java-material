package Usecase;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImp;

import Employee.Employee;
import Employee.EmployeeException;

public class registerEmployee {
	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("enter your id");
		int id=sc.nextInt();
		
		System.out.println("enter your name");
		String n=sc.next();
		System.out.println("enter your address");
		String ad=sc.next();
		System.out.println("enter your salary");
		int sl=sc.nextInt();

		
		Employee emp=new Employee(id,n,ad,sl);
 EmployeeDao ed=new EmployeeDaoImp();
  ed.registerEmployee(emp);
	}

}
