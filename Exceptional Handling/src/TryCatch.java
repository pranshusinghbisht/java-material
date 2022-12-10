import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0]= 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index = : ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with : ");
        int num = sc.nextInt();

        try{
            System.out.println(marks[ind]/num);
        }catch (ArithmeticException e){
            System.out.println("Arthmetic Exception Occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Array Index Out Of BoundsException");
            System.out.println(e);
        }
    }
}
