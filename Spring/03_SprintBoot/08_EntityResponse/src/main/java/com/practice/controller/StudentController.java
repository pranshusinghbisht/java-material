package com.practice.controller;

import com.practice.model.Student;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>();

public StudentController(){
    students.add(new Student(10,"ram",200));
    students.add(new Student(11,"shyam",400));
    students.add(new Student(12,"pranshu",500));
    students.add(new Student(13,"hrithik",100));
    students.add(new Student(14,"ramesh",300));
}

@GetMapping("/students")
public List<Student> getAllStudentDetailsHandler(){
    return students;
}




// here we using ResponseEntity instead of return type... it givs us more flexibility
@GetMapping("/students/{roll}")
public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll){
   List<Student> list = students.stream().filter(s -> s.getRoll() == roll).collect(Collectors.toList());

   if(list.size() == 0){
       throw new IllegalArgumentException("Student does not exist with roll : "+roll);

   }

      // return list.get(0);

    HttpHeaders hh = new HttpHeaders();
   hh.add("user","admin");
    hh.add("jwt","abc");


    return new ResponseEntity<Student>(list.get(0),hh, HttpStatus.OK);
}

}
