package com.example.controller;

import com.example.model.Address;
import com.example.model.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // @Controller + @ResponseBody
@RequestMapping("/app")
public class MyController { // resourse root

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("hello") // this shorcut is privided by spring boot
    public String sayHello(){
        return "Welcome Spring Boot";
    }


    @GetMapping( value = "/students" , produces = MediaType.APPLICATION_JSON_VALUE)
    // to generate the data in xml we need to add the following dependency in the : jackson-dataformat-xml
    public List<Student> getStudentHandler() {

        //creating object 1
        Student student = new Student();
        student.setName("Pranshu");
        student.setRoll(10);
        student.setAddress(new Address("lucknow","UP"));
        student.setMarks(125);

        //creating object 2
        Student student2 = new Student();
        student2.setName("Pranshu");
        student2.setRoll(10);
        student2.setAddress(new Address("lucknow","UP"));
        student2.setMarks(125);

        //creating object 3
        Student student3 = new Student();
        student3.setName("Pranshu");
        student3.setRoll(10);
        student3.setAddress(new Address("lucknow","UP"));
        student3.setMarks(125);

        //adding objects inside the list
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);

        return list;

    }

// List of object in json [{},{},{}]

    //*note: We cannot have two api name with same http method










    // Path variable

/*@GetMapping("/students/{roll}")
    public Student getStudentHandler2(@PathVariable("roll") Integer roll){

        //We can connect with SL --> DAL --> DB
        //to get the student details for roll


        Student s1 = new Student(roll,"Ravi",12,new Address("Up","Up"));

        return s1;

    }*/



    // Request Parameters


    // ? roll = 123

    @GetMapping("/stud")
    public Student getStudentHandler2(@RequestParam(value = "roll", required = false) Integer roll,@RequestParam(value = "name", defaultValue = "100") String name){

        //We can connect with SL --> DAL --> DB
        //to get the student details for roll


        Student s1 = new Student(roll,name,12,new Address("Up","Up"));

        return s1;

    }







}
