package com.example.app.service;

import com.example.app.model.Student;
import com.example.app.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao dao;

    @Override
    public Student saveStudentDetails(Student student) {
  Student s =  dao.save(student);
        return s;
    }
}
