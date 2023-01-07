package com.practice.model;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class A{
private int age;
private String name;

    public A() {
        System.out.println("Inside Constructors...");
        System.out.println("inside cons. Age is..."+age);
        System.out.println("inside cons. Name is..."+name);

    }

    public void mySetup(){
    //Connection creating logic
    //initialization logic

    System.out.println("inside mySetup method");
        System.out.println("inside mySetup. Age is..."+age);
        System.out.println("inside mySetup. Name is..."+name);
}

    public void ending(){
        System.out.println("Side ending");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
