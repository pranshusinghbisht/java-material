package org.example.abstraction;





public abstract class Animal {
    // user ---------------->------------------>------------(some data which is not useful/required for user)--- facebook

    //abstract method
    abstract void walk(); // unimplemneted abstract method

    abstract void eat();

   // non abstract methods // noraml method
    public void run(){

    }




    // An abstract class must be declared with an abstract keyword
    //It can have abstract and non abstract methods
    //abstract method is always inside the abstract class
    //abstract method should be unplemented
    //it cannot be instantiated -> you cant make an object of an abstract class
    // it can have constructors and static methods also
}
