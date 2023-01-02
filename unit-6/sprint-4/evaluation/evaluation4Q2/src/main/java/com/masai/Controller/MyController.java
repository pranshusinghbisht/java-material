package com.masai.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exceptions.AccountException;
import com.masai.Model.Account;
import com.masai.Service.AccountService;

@RestController
public class MyController {
	@Autowired
	private AccountService service;

	
	@PostMapping("/save")
	public ResponseEntity<Account> save(@RequestBody Account emp) throws AccountException{
		
	Account emp1 = service.openAccount(emp);
	
	
	return new ResponseEntity<Account>(emp1,HttpStatus.OK);
	
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Account> delete(@PathVariable("id") Integer acc) throws AccountException{
		
	Account emp1 = service.closeAccount(acc);
	
	
	return new ResponseEntity<Account>(emp1,HttpStatus.OK);
	
	}
	
	
//	DepositAmount
	
	@PutMapping("/update/{id}/{bal}")
	public ResponseEntity<Account> depositAmount(@PathVariable("id") Integer Id, @PathVariable("bal") Integer Bal) throws AccountException{

		
		
	Account emp1 = service.depositAmount(Id,Bal);
	
	
	return new ResponseEntity<Account>(emp1,HttpStatus.OK);
	
	}
	
	
	@PutMapping("/withdraw/{id}/{bal}")
	public ResponseEntity<Account> withdrawAmmount(@PathVariable("id") Integer Id, @PathVariable("bal") Integer Bal) throws AccountException{

	Account emp1 = service.depositAmount(Id,Bal);
	
	return new ResponseEntity<Account>(emp1,HttpStatus.OK);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
