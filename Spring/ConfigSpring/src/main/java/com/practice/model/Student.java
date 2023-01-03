package com.practice.model;

public class Student {
    private int studentId;
    private String studentname;
    private String studentAddress;

    public Student() {}

    public Student(int studentId, String studentname, String studentAddress) {
        this.studentId = studentId;
        this.studentname = studentname;
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentname='" + studentname + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
