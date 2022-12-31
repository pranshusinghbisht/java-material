package com.onetoone.bidirectional.models;

import javax.persistence.*;

@Entity
@Table(name = "jpda_student")
public class Student {
    @Id
    private int studentId;
    private  String studentName;
    private String about;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;

    // cascade = CascadeType.ALL we do this because we want to change in parent entity class if will automatically oration with child class

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
