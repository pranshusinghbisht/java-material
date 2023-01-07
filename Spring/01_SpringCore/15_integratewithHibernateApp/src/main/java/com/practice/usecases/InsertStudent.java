package com.practice.usecases;

import com.practice.configuration.AppConfig;
import com.practice.model.Student;
import com.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller(value = "sc")
public class InsertStudent {

    @Autowired
    private StudentService sService;

    public void insertStudent(){
        Scanner sc = new Scanner(System.in);

        //take the student details from the user
        //compose student obj.
        // call the saveStudent() of StudentService

        System.out.println("Enter name : ");
        String name = sc.next();

        System.out.println("Enter Marks");
        int marks = sc.nextInt();



        Student student = new Student();
        student.setName(name);
        student.setMarks(marks);


       String res = sService.saveStudent(student);
        System.out.println(res);
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       InsertStudent obj =  ctx.getBean("sc",InsertStudent.class);
       obj.insertStudent();
    }


}
