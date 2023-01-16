package com.masai.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	public List<Employee> findByAddress(String address);
	
}
