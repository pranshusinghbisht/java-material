package org.example.constructorFunction;

public class Daddu {

    private int age;
    private String gf;


    //
    public void smart(){
        System.out.println("daddu is smart");
    }


    //this constructor method/funtion
    public Daddu(int age, String gf) {
        this.age = age;   //this.age -> line no:5 , a = line 16
        this.gf = gf;
    }

    @Override
    public String toString() {
        return "Daddu{" +
                "age=" + age +
                ", gf='" + gf + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Daddu daddu = new Daddu(12,"ram");
        Daddu daddu2 = new Daddu(61,"shimla");



        System.out.println(daddu2);





    }


}
