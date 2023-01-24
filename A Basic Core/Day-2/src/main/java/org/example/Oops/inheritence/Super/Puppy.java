package org.example.Oops.inheritence.Super;

public class Puppy extends Dog {
    String color = "Black";

    public void printColor(){
        System.out.println("normal-> "+ color);

        System.out.println("super-> "+super.color); //white
        System.out.println("this-> "+this.color); //black

    }
}
