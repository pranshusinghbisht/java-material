package com.setterinjection;

public class Travel {

    //user-Defined object
   private Vehicle v;


   //simple value type
    int numberOFPerson;


    //setter injection point for numberOfPerson
    public void setNumberOFPerson(int numberOFPerson) {
        this.numberOFPerson = numberOFPerson;
    }


    //setter injection point for v
    public void setV(Vehicle v) {
        this.v=v;
    }


    public void journey() {
        v.go();
        System.out.println("Jounrney started...");

        System.out.println("number of person are :"+numberOFPerson);
    }

}