package com.setterinjection;

class Bike implements Vehicle{


    public void ride() {
        System.out.println("ride started....");
    }

    @Override
    public void go() {
        ride();

    }
}