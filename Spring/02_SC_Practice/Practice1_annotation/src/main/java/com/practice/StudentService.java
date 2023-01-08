package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    // inject 3 entries with valid details
    @Autowired
    private Map<Student, Course> theMap;
    public void printMap(){
        System.out.println(theMap);
    }



    //inject List of 5 Student object
    @Autowired
    @Qualifier("getList")  // not medatorary
private List<Student> theList;
    public void printList(){
        theList.sort((a,b) -> a.getMarks()>b.getMarks()?1:-1);
        theList.forEach(student -> System.out.println(student));
//        for(Student em : theList){
//            System.out.println(em);
//        }
    }

    //inject the AppName from the properties file
    @Value("${file.appName}")
    private String appName;
    public void printAppName(){
        System.out.println(appName);
    }



}
