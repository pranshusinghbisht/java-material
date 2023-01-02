package callerclasses;

import java.util.Scanner;

import com.beanclass.Account;
import com.interfaces.AccountDao;

import InterfaceIMPL.AccountDaoimpl;

public class Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("enter id to find details");
//		int id = sc.nextInt();

		Account acc = new Account(15, "xyw@g.com", "metro", 445);

		AccountDao ad = new AccountDaoimpl();

		String ac = ad.update(acc);

		System.out.println(ac);

	}

}
