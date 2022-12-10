package com.dao;

import com.exceptions.CourseException;
import com.exceptions.StudentException;
import com.model.Student;

public interface StudentDao {

    public String registerStudent(Student student) throws StudentException;

    public Student loginStudent(String username, String password) throws StudentException;

    public String enrollStudentInCourse(int roll, int cid) throws StudentException, CourseException;



}
