package com.practice.model;

import javax.persistence.*;

@Entity
@NamedQuery(name = "employee.getSalary", query = "select e from Employee e where e.salary <: sal")
@NamedNativeQuery(name="allEmployee" ,query = "select * from Employee",resultClass= Employee.class)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String address;
    private String name;
    private  int salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
