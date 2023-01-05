package com.circulardependency;

public class B {
    A a1;

    public B(A a1) {
        this.a1 = a1;
    }

    public void showB(){
        System.out.println("inside showB of B");
        System.out.println("A object is "+a1);
    }
}
