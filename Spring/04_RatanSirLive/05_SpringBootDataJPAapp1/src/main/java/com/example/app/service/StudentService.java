package com.example.app.service;

import com.example.app.model.Student;

public interface StudentService {

    //this method will take student object without rollnumber
    // and return the saved student object with auto generated roll
    public Student saveStudentDetails(Student student);
}
