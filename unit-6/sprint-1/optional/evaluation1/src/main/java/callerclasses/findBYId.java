package callerclasses;

import java.util.Scanner;

import com.beanclass.Account;
import com.interfaces.AccountDao;

import InterfaceIMPL.AccountDaoimpl;

public class findBYId {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id to find details");
		int id = sc.nextInt();
		
		AccountDao ad = new AccountDaoimpl();
		
		Account ac = ad.findById(id);
		
		
		System.out.println(ac);
		
		
	}

}
