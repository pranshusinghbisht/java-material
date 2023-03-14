package lambdaExpression;

public class Main {
    public static void main(String[] args) {
/*
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.sayHello();

       //Anounomous class
        MyInterface i = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("using anounmous class");
            }

        };
        i.sayHello();*/


        // using lambda expresiion (for functional interface)   implementation of functional interface using lambda expression
    MyInterface i = () -> {
        System.out.println("Using lambda expression");
    };
    i.sayHello();



    // code : sumInterface

        SumInterface sumInterface = (a, b) -> a+b;

        System.out.println(sumInterface.sum(2,5));

    }
}