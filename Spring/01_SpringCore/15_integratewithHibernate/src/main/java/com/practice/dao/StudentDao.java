package com.practice.dao;

import com.practice.model.Student;
import com.practice.service.StudentService;

import java.util.List;

public interface StudentDao {
    public String insertStudentDetails(Student student);
    public List<Student> getAllStudentDetails();
}
