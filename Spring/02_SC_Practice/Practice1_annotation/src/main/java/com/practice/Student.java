package com.practice;

public class Student {
    private int roll;
    private String name;
    private String address;
    private String email;
    private int marks;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getMarks() {
        return marks;
    }

    public Student() {
    }

    public Student(int roll, String name, String address, String email, int marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.email = email;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", marks=" + marks +
                '}';
    }
}
