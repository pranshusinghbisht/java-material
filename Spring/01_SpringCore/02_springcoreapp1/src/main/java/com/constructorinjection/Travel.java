package com.constructorinjection;

public class Travel {

    //user-Defined object
   private Vehicle v;


   //simple value type
    int numberOFPerson;


    public Travel(Vehicle v, int numberOFPerson) {
        this.v = v;
        this.numberOFPerson = numberOFPerson;
    }

    public void journey() {
        v.go();
        System.out.println("Jounrney started...");

        System.out.println("number of person are :"+numberOFPerson);
    }

}