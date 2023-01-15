package com.example.App.service;

import com.example.App.dao.CourseDao;
import com.example.App.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl(){

    }


    @Override
    public List<Course> getCourses() {

        return courseDao.findAll();
    }

    @Override
    public Course getCourse(int courseId) {

//        return courseDao.getOne(courseId);
          return courseDao.getReferenceById(courseId);

    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
            return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }


    @Override
    public void deleteCourse(int courseId) {
   Course course = courseDao.getReferenceById(courseId);
   courseDao.delete(course);

        }
}
