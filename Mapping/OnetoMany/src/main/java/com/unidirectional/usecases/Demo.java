package com.unidirectional.usecases;

import com.unidirectional.models.Address;
import com.unidirectional.models.Student;
import com.unidirectional.utility.EMUtil;

import javax.persistence.EntityManager;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        Student student = new Student();
        student.setStudentName("Pranshu");
        student.setAbout(" I am software developer");
        student.setStudentId(12);

        Address a1 = new Address();
        a1.setAddressId(1);
        a1.setStreet("Telibagh");
        a1.setCity("Lucknow");
        a1.setCountry("India");
        a1.setStudent(student);

        Address a2 = new Address();
        a2.setAddressId(2);
        a2.setStreet("Mohanlal");
        a2.setCity("Pothoragarh");
        a2.setCountry("India");
        a2.setStudent(student);

//        student.getAddressList().addAll();
        ArrayList<Address> addressList = new ArrayList<>();
        addressList.add(a1);
        addressList.add(a2);

        student.setAddressList(addressList);



        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        System.out.println("Student created with address...");
        em.close();
    }
}
