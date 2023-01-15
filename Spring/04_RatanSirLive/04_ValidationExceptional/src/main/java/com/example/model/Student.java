package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


public class Student {

//    @JsonProperty("ROLL")

    @NotBlank
    @Min(value = 5,message = "{roll.invalid}")
    private Integer roll;
    private String name;

    @JsonIgnore // it will hide
    private Integer marks;

    public Student() {
    }

    public Student(Integer roll, String name, Integer marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }


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
                ", marks=" + marks +
                '}';
    }
}
