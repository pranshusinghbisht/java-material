package com.Bank.usecases;

import com.Bank.dao.AccountDao;
import com.Bank.dao.AccountDaoImpl;
import com.Bank.model.Account;

import java.util.Scanner;

public class DepositUseCase {

    public static void main(String[] args) {


    AccountDao dao = new AccountDaoImpl();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        int accno = sc.nextInt();

        Account acc = dao.findAccount(accno);

        if(acc == null)
            System.out.println("Account does not exist : ");

        else
            System.out.println("Enter amount tp Deposit : ");

        int amt = sc.nextInt();

        acc.setBalance(acc.getBalance()+amt);

        boolean f = dao.updateAccount(acc);

        if(f)
            System.out.println("Deposit Successfully...");
        else
            System.out.println("Technical Error...");
    }


}
