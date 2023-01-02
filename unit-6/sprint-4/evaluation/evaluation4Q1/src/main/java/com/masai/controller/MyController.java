package com.masai.controller;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.validation.Valid;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exceptions.EmployeeException;
import com.masai.Model.Employee;
import com.masai.Model.EmployeeDTO;
import com.masai.Service.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService service;
	
	
	
	@PostMapping("/save")
	public ResponseEntity<Employee> save(@Valid @RequestBody Employee emp) throws EmployeeException{
		
	Employee emp1 = service.registerEmployee(emp);
	
	
	return new ResponseEntity<Employee>(emp1,HttpStatus.OK);
	
	}
	

	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> delete(@PathVariable("id") Integer ID) throws EmployeeException{
		
	Employee emp1 = service.deleteEmployeeById(ID);
	
	
	return new ResponseEntity<Employee>(emp1,HttpStatus.OK);
	
	}
	
	
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) throws EmployeeException{

		
		
	Employee emp1 = service.updateEmployee( emp);
	
	
	return new ResponseEntity<Employee>(emp1,HttpStatus.OK);
	
	}
	


	
	
	
}
