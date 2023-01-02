package com.masai;

import java.util.Objects;

public class Employee {
	
	private int empId;
	private String empName;
	private String address;
	private int salary;
	public Employee(int empId, String empName, String address, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", salary=" + salary
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, empId, empName, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && empId == other.empId && Objects.equals(empName, other.empName)
				&& salary == other.salary;
	}
	
	

}
