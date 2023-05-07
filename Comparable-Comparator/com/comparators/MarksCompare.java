package com.comparators;

import java.util.Comparator;

public class MarksCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {


        if(o1.getMarks() == o2.getMarks()){
            return o1.getName().compareTo(o2.getName());
        }else{
            return o1.getMarks() - o2.getMarks();
        }
    }
}
