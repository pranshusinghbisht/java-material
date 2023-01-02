package com.masai.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.AccountException;
import com.masai.Exceptions.InvalidException;
import com.masai.Model.Account;
import com.masai.Model.AccountDTO;
import com.masai.Repo.AccountDao;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao dao;

	@Override
	public Account openAccount(Account acc) throws AccountException {
		Account acc1 = dao.save(acc);

		return acc1;
	}


	
	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		

			Optional<Account> emp = dao.findById(accno);

			if (emp.isPresent()) {
				Account em = emp.get();

				dao.delete(em);
				return em;
			}

			throw new AccountException("Account not present ");
		}



	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
	
		Optional<Account> acc = dao.findById(accno);

		if (acc.isPresent()) {
			Account ac  = acc.get();
			ac.setBalance(ac.getBalance()+amount);

			dao.save(ac);
			return ac;
		}

		
		
		
		throw new AccountException("not any Account foundd");

	}



	@Override
	public Account withdrawAmmount(Integer accno, Integer amount) throws AccountException, InvalidException {
		Optional<Account> acc = dao.findById(accno);
			
		
		
		if (acc.isPresent()) {
			
			Account ac  = acc.get();
			
			
			if(ac.getBalance()==0|| ac.getBalance()<amount) {
				throw new InvalidException("your balance is very low");
			}
			
			ac.setBalance(ac.getBalance()-amount);

			dao.save(ac);
			return ac;
		}

		
		
		
		throw new AccountException("not any Account foundd");
	}


    @Override
	public String transferAmount(AccountDTO dto) throws AccountException, InvalidException {
		// TODO Auto-generated method stub
	
		return null;
	}
	

	
	
	

}
