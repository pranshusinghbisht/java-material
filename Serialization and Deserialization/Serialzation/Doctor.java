package Serialzation;

import java.io.Serializable;

public class Doctor implements Serializable {
    int id;
    String name;

    public Doctor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display(){
        System.out.println("Your name is : "+name);
        System.out.println("Your name is : "+id);
    }
}
