package com.unidirectional.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_student")
public class Student {
    @Id
    private int studentId;
    private  String studentName;
    private String about;


    // many address
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address> addressList = new ArrayList<>();

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }


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
}
