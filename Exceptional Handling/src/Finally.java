import java.util.Scanner;

public class Finally {
    public static void add(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

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