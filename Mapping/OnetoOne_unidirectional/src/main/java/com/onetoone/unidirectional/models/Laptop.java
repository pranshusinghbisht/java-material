package com.onetoone.unidirectional.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jpa_laptops")
public class Laptop {
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;
}
