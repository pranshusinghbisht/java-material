package com.example.App.service;

import com.example.App.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(145,"Java Core","this is java basic course"));
        list.add(new Course(146,"Spring Boot","this is java advance course"));

    }


    @Override
    public List<Course> getCourses() {

        return list;
    }

    @Override
    public Course getCourse(int courseId) {
        Course c = null;
        for(Course course: list){
            if(course.getId()==courseId){
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        list.forEach(e -> {
           if(e.getId() == course.getId()){
               e.setTitle(course.getTitle());
               e.setDescription(course.getDescription());
           }
        });
        return course;
    }


    @Override
    public void deleteCourse(int courseId) {
    list = this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
    }
}
