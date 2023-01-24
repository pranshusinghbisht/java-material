package org.example;

public class StaticClass {

    public void mein(){
        System.out.println("mein hu pranshu");
    }


    // preference milti when we use static

    public static void tu(){
        System.out.println("tu chamaar hai");
    }

    public void sum1(){
        int a = 3;
        int b = 4;
        System.out.println(a+b);
    }

    public static void sum2(){
        int a = 3;
        int b = 4;
        System.out.println(a+b);
    }




    public static void main(String[] args) {

        StaticClass staticClass = new StaticClass();
        staticClass.mein();



    }
}
