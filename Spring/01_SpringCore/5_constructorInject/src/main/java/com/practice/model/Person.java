package com.practice.model;

public class Person {
    private String name;
    private int personId;

    private  Certificate certi;

    public Person(String name, int personId ,Certificate certi) {
        this.name = name;
        this.personId = personId;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi +
                '}';
    }
}
