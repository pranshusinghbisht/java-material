package com.example.app.service;

import com.example.app.exception.StudentException;
import com.example.app.model.Student;

import java.util.List;

public interface StudentService {

    //this method will take student object without rollnumber
    // and return the saved student object with auto generated roll
    public Student saveStudentDetails(Student student);

    Student getStudentByRoll(Integer roll) throws StudentException;

    public List<Student> getAllStudentDetails() throws StudentException;

    public Student deleteStudentByRoll(Integer roll) throws StudentException;

/*    public Student updateStudentDetails(Student student) throws StudentException;

    public Student updateMarksForStudnetByRoll(Integer roll, Integer graceMarks) throws StudentException;*/

    public Student getStudentByMarks(int marks) throws StudentException;



    public String getStudentNameAndMarksByRoll(Integer roll) throws StudentException;
}
