package com.example.controller;

import com.example.model.Address;
import com.example.model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController //
public class MyController {

/*    @PostMapping(value = "/students", consumes =  MediaType.APPLICATION_JSON_VALUE)
    public String saveStudentHandler(@RequestBody Student student){
        //student object need to be persisted inside the DB


        return "Student saved successfully";


    }*/


/*    @PutMapping(value = "/students/{roll}")
    // Response Entity

    public ResponseEntity<Student> updateStudentHandler(@RequestBody Student student,@PathVariable Integer roll){
        //using roll we need to get the existing resource which we need to update with request body data

        student.setRoll(roll);

        HttpHeaders hh = new HttpHeaders();
        hh.add("jwttoken","asdffqwertdg");
        hh.add("user","pranshu");
        hh.add("abc","xyz");


        ResponseEntity<Student> re = new ResponseEntity<>(student,hh, HttpStatus.ACCEPTED);
        // using entity we can change the status code and we can add Http headers
        return re;
    }*/

    private Map<Integer,Student> map = new HashMap<>();

    @PostConstruct
    public void setup(){
        map.put(10, new Student(10,"pranshu",400));
        map.put(11, new Student(10,"Hrithik",500));
        map.put(12, new Student(10,"Chetan",406));

    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudentHandler(){
     Collection<Student> col = map.values();

     List<Student> students = new ArrayList<>(col);

     return new ResponseEntity<>(students,HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<String> saveStudentHandler(@RequestBody Student student){
        map.put(student.getRoll(),student);

        return new ResponseEntity<>("Student saved",HttpStatus.CREATED);
    }


    @GetMapping("/students/{roll}")
    public ResponseEntity<Student> getStudentByRollHandler(@PathVariable Integer roll){

        if(map.containsKey(roll)){
           Student student = map.get(roll);

           return new ResponseEntity<>(student,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
