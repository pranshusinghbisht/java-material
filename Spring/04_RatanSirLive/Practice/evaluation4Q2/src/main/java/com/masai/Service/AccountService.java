package com.masai.Service;

import com.masai.Exceptions.AccountException;
import com.masai.Exceptions.InvalidException;
import com.masai.Model.Account;
import com.masai.Model.AccountDTO;

public interface AccountService {

	public Account openAccount(Account acc)throws AccountException;
	
	public Account closeAccount(Integer accno)throws AccountException;
	
	public Account depositAmount(Integer accno, Integer amount)throws AccountException;
	
	public Account withdrawAmmount(Integer accno, Integer amount)throws AccountException, InvalidException;

	public String transferAmount(AccountDTO dto)throws AccountException,InvalidException;

}
