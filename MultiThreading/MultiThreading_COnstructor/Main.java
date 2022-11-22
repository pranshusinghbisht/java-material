package MultiThreading_COnstructor;

class myThread extends Thread{
    public myThread(String name){
        super(name);
    }
    public void run(){
        int i=8;
        System.out.println("Thank You");
    }
}

public class Main {
    public static void main(String[] args) {
        myThread t1 = new myThread("Pranshu");
        myThread t2 = new myThread("Singh Bisht");
        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t1.getName());

    }
}
