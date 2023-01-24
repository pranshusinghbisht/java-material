package org.example.Oops.polymorphism.CompileTime;

public class Student {
    private String name;
    private int age;


    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }



    public static void main(String[] args) {
        Student student = new Student();
        student.printInfo("Sheetaala mata",16);
    }
}
