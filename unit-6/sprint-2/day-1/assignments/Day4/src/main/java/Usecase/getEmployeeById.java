package Usecase;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImp;

import Employee.Employee;
import Employee.EmployeeException;

public class getEmployeeById {

	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("enter your id");
int id=sc.nextInt();


		 EmployeeDao ed=new EmployeeDaoImp();
		 Employee e=ed.getEmployeeById(id);
		  System.out.println(e); 
	}

}
