package com.dao;

import com.exceptions.CourseException;
import com.model.StudentCourseDTO;

import java.util.List;

public interface CourseDao {
    public List<StudentCourseDTO> getAllStudentsByCourseName(String cname) throws CourseException;

}
