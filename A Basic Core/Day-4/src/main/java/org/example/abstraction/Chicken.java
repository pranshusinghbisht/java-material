package org.example.abstraction;

public class Chicken extends Animal{
    @Override
    void walk() {
        System.out.println("walk on 2 legs");
    }

    @Override
    void eat() {
        System.out.println("i eat nuts");
    }


}
