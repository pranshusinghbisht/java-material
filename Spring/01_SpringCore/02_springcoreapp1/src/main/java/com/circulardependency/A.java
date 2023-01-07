package com.circulardependency;

public class A {
    B b1;

    public void setB1(B b1) {
        this.b1 = b1;
    }

    //    public A(B b1) {
//        this.b1 = b1;
//    }

    public void showA(){
        System.out.println("Inside showA of A");

        System.out.println("B obj is : "+b1);
    }
}
