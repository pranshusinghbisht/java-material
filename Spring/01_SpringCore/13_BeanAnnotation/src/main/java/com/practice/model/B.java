package com.practice.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class B {

    @Bean
    public Student getStudent() {
        Student student = new Student(10, "Ram", 720);
        return student;
    }
}
