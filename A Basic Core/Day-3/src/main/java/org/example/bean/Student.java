package org.example.bean;

//bean class
public class Student {

    //template -> rules about bean class

    //1. instance variables should be private
    private int roll;
    private String name;
    private int marks;
    private String address;


    //2. class have constructors -> default cons, parameterised


    public Student() {
    }

    public Student(int roll, String name, int marks, String address) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }

    //3. it should have getters and setter


    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // 4. you have to override toString()


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", address='" + address + '\'' +
                '}';
    }
}
