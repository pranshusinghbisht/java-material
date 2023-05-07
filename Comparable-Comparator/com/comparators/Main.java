package com.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(1,"Pranshu",12));
        list.add(new Student(3,"Hritik",32));

        list.add(new Student(4,"Chetan",42));

        list.add(new Student(2,"Kunal",42));

        Collections.sort(list, new MarksCompare());

        System.out.println(list.toString());


    }
}
