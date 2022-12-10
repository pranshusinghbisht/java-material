package com.model;

public class StudentCourseDTO {
    private int roll;
    private String name;
    private String address;
    private String email;

    private String  cname;
    private int fee;
    private String duration;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "StudentCourseDTO{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", cname='" + cname + '\'' +
                ", fee=" + fee +
                ", duration='" + duration + '\'' +
                '}';
    }
}
