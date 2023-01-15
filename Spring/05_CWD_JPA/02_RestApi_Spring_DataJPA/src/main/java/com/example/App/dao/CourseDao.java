package com.example.App.dao;

import com.example.App.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

// course(class) , Integer(primary key)

@Component
public interface CourseDao extends JpaRepository<Course,Integer> {


}
