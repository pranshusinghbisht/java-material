package com.onetoone.bidirectional.models;

import javax.persistence.*;

@Entity
@Table(name = "jpa_laptops")
public class Laptop {
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;

    //for bidirectional we will do this side as well
    @OneToOne
    //change foregin key name
    @JoinColumn(name = "student_id")
    private Student student;

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
