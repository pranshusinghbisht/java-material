package com.onetoone.bidirectional.usecases;

import com.onetoone.bidirectional.models.Laptop;
import com.onetoone.bidirectional.models.Student;
import com.onetoone.bidirectional.utility.EMUtil;

import javax.persistence.EntityManager;

public class Demo {
    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

        Student student = new Student();
        student.setStudentName("Pranshu");
        student.setAbout(" I am software developer");
        student.setStudentId(12);

        Laptop laptop = new Laptop();
        laptop.setModelNumber("1221");
        laptop.setBrand("Lenove");
        laptop.setLaptopId(25);

        laptop.setStudent(student);
        student.setLaptop(laptop);

//        to avoid save manully laptop we set cascade = caecadetype.all


        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        System.out.println("done...");
        em.close();
    }
}
