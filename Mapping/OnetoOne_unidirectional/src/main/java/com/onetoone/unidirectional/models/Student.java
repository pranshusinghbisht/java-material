package com.onetoone.unidirectional.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jpda_student")
public class Student {
    @Id
    private int studentId;
    private  String studentName;
    private String about;

    @OneToOne
    private Laptop laptop;




}
