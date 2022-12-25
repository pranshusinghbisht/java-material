package com.Bank.usecases;

import com.Bank.dao.AccountDao;
import com.Bank.dao.AccountDaoImpl;
import com.Bank.model.Account;

import java.util.Scanner;

public class WithdrawlUseCase {
    public static void main(String[] args) {
        AccountDao dao = new AccountDaoImpl();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number : ");
        int ano = sc.nextInt();

        Account acc = dao.findAccount(ano);

        if(acc == null){
            System.out.println("Account not exist...");
        }
        else{
            System.out.println("Enter the withdrawing amount");
            int amt =sc.nextInt();

            if(amt <= acc.getBalance()){
                acc.setBalance(acc.getBalance()-amt);
                boolean f = dao.updateAccount(acc);
                if(f)
                    System.out.println("Please Collect the cash...");
                else
                    System.out.println("Technical Error...");
            }else{
                System.out.println("Insufficient Amount...");
            }
        }
    }
}
