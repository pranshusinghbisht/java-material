package com.Bank.usecases;

import com.Bank.dao.AccountDao;
import com.Bank.dao.AccountDaoImpl;
import com.Bank.model.Account;

public class CreateAccount {
    public static void main(String[] args) {

        AccountDao dao = new AccountDaoImpl();

    Account acc1 = new Account();

    acc1.setName("Hrithik");
    acc1.setBalance(800);

    boolean f = dao.createAccount(acc1);

    if(f)
        System.out.println("Account created...");
    else
        System.out.println("Not created...");

    }
}
