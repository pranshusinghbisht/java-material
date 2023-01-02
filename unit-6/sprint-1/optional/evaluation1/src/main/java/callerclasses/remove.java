package callerclasses;

import java.util.Scanner;

import com.beanclass.Account;
import com.interfaces.AccountDao;

import InterfaceIMPL.AccountDaoimpl;

public class remove {

	
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id to find details");
		int id = sc.nextInt();
		
		  
		AccountDao ad = new AccountDaoimpl();
		
		String  ac = ad.remove(id);
		
		
		System.out.println(ac);
		
		
	}
}
