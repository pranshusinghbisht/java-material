package com.example.App.controller;

import com.example.App.entity.Course;
import com.example.App.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    public CourseService courseService;

    public String home() {
        return "Welcome to courses application";
    }


    //get the courses

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }


    //single courses get

    @GetMapping("/courses/{courseId}")
    public Course getCourses(@PathVariable int courseId){
        return this.courseService.getCourse(courseId);
    }


    //course add
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    //update course using PUT request
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return  this.courseService.updateCourse(course);
    }

    //delete the course
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable Integer courseId){
        try {
            this.courseService.deleteCourse(courseId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
