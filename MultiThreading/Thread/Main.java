package Thread;

class myThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6000; i++) {
            System.out.println("I am genious");
            System.out.println("I am genious");
            System.out.println("I am genious");
            System.out.println("I am genious");
            System.out.println("I am genious");
        }
    }
}
    class myThread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 6000; i++) {

                System.out.println("I am thread2");
                System.out.println("I am thread2");
                System.out.println("I am thread2");
                System.out.println("I am thread2");
                System.out.println("I am thread2");
                System.out.println("I am thread2");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {

            System.out.println("Hello world!");

            myThread x = new myThread();
//x.start();y.start();  one way


         //another way;
            Thread th1 = new Thread(x);
            myThread2 y = new myThread2(); //gun
            Thread th2 = new Thread(y); //bullet

            th1.start();
        th2.start();

        }
    }

