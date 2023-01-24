package org.example.bean;


//bean class
public class Employee {

/*    empId,
    name,
    salary,
    address*/

    private int empId;
    private int salary;
    private String address;

    public Employee() {
    }

    public Employee(int empId, int salary, String address) {
        this.empId = empId;
        this.salary = salary;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

    /*    public static void main(String[] args) {
        //const
        Employee employee = new Employee(1,20000,"lucknow");

        //setter
        employee.setEmpId(1);
        employee.setSalary(20000);
        employee.setAddress("lucknow");


        System.out.println(employee.getEmpId());


    }*/
}
