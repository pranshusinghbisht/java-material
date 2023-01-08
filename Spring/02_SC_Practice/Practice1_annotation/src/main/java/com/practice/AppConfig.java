package com.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.practice")
@PropertySource("appName.properties")
public class AppConfig {

    // inject 3 entries with valid details

    @Bean
    public Map<Student, Course> getMap(){
        Map<Student,Course> map = new HashMap<>();
        map.put(new Student(102,"Pranshu","Lucknow","pranshubisht@gmail.com",700),new Course(6,"Java","45Days",120));
        map.put(new Student(103,"Prans","Lcknow","pranshubish@gmail.com",700),new Course(7,"Jav","4Days",12));
        map.put(new Student(104,"Prahu","Luknow","pranshusht@gmail.com",700),new Course(8,"Jva","46Days",140));

        return map;
    }

    @Bean
    public List<Student> getList(){
        List<Student> list = new ArrayList<>();
        list.add(new Student(102,"Pranshu","Luckniw","pranshu@gmil.com",201));
        list.add(new Student(103,"Prashu","Luckniw","pranshu@mail.com",204));
        list.add(new Student(104,"Prnshu","Lucniw","pransh@gmail.com",261));
        list.add(new Student(105,"ranshu","Luckniw","prashu@gmail.com",701));
        list.add(new Student(106,"Panshu","Lckniw","panshu@gmail.com",271));

        return list;
    }




}
