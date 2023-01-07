package com.practice.service;

import com.practice.dao.StudentDao;
import com.practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{


    //exception will thrown in the service layer
    @Autowired
    private StudentDao studentDao;

    @Override
    public String saveStudent(Student student) {
       return studentDao.insertStudentDetails(student);
    }

    @Override
    public List<Student> getAllStudent() {
    return studentDao.getAllStudentDetails();
        }
}
