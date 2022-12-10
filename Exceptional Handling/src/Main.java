import java.util.Scanner;

public class Main {
    public static void add(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {

//        Run time error

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
/*

        System.out.println(num1/num2); /// run time error -> excceptional

        user wrong input -> innput -> issues -> exception


        1) chhecked exep -> compile time exception (handle by compiler)
        22) unchecked exception -> run time exception
*/

        // 1) Null Pointer exception
        // 2) Arthmetic
        // 3) Array index out of bound exception  // arr length 3 -> 4

/*        int[] arr = {
                1,
                2,
                3
        };


        for(int i=0; i<3; i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr[-1]);
    }*/

        // 4. illefgal argument exception ->

        //5. 'Number format exception
//        conversion karte time jo error aata hai


//        how to handle exception

        try{
            System.out.println(num1/num2); // write code for try
        }
        catch (ArithmeticException e){
//            System.out.println("We failed to divide");
            System.out.println("Hi I am in catch block");
//            System.out.println(e);
        }
        finally {
            System.out.println("Hi I am Finally");
        }
    }
}