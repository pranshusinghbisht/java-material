package com.example.App.service;

import com.example.App.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(int courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(int courseId);
}
