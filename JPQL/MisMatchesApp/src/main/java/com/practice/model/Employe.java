package com.practice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String ename;
    private int salary;

    @ElementCollection
    @Embedded
    @JoinTable(name="empaddress",joinColumns=@JoinColumn(name="emp_id"))
     private List<Address> addresses = new ArrayList<>();

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    /*    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "state", column = @Column(name = "HOME_STATE")),
            @AttributeOverride(name="city", column = @Column(name = "HOME_CITY")),
            @AttributeOverride(name="pincode", column = @Column(name = "HOME_PINODE")),
    })
    private Address homeAddress;

@Embedded
@AttributeOverrides({
        @AttributeOverride(name="state", column = @Column(name = "OFFICE_STATE")),
        @AttributeOverride(name="city", column = @Column(name = "OFFICE_CITY")),
        @AttributeOverride(name="pincode", column = @Column(name = "OFFICE_PINODE")),
})
    private Address officeAddress;*/


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

/*    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }*/


}
