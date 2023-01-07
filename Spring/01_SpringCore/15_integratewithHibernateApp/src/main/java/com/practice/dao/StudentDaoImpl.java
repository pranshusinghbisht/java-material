package com.practice.dao;

import com.practice.model.Student;
import com.practice.utility.EMUtil;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

//hibernate in this area (perform CRUD operation here)

@Repository
public class StudentDaoImpl implements StudentDao{
    @Override
    public String insertStudentDetails(Student student) {

        EntityManager em = EMUtil.provideEntityManager();

        em.getTransaction().begin();
        em.persist(student);

        em.getTransaction().commit();
        em.close();

        return "Student object registered Sucessfully";
    }

    @Override
    public List<Student> getAllStudentDetails() {
        EntityManager em = EMUtil.provideEntityManager();


      Query q = em.createQuery("select s from Student s");

      List<Student> students = q.getResultList();
        em.close();
        return students;
    }
}
