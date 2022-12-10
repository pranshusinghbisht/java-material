public class Throw {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 0;
        if(num2 == 0){
            throw new ArithmeticException("Div by 0");
        }
        else{
            System.out.println(num1/num2);
        }
    }
}

// try catch -> recommended
// throw and throws
