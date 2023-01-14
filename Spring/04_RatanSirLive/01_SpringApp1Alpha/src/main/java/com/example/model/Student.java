package com.example.model;

public class Student {
    private Integer roll;
    private String name;
    private Integer marks;

    public Student() {
    }

    public Student(Integer roll, String name, Integer marks, Address address) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }

    private Address address;

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                ", address=" + address +
                '}';
    }
}
