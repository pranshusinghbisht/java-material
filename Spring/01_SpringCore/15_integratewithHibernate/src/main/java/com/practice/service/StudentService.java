package com.practice.service;

import com.practice.model.Student;

import java.util.List;

public interface StudentService {
    public String saveStudent(Student student);
    public List<Student> getAllStudent();
}
