package thread_Priorities;

class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    public void run(){
        int i= 34;
        System.out.println("Thank u " + this.getName());
    }
}


public class Main {
    public static void main(String[] args) {
        // Ready Queue
        // We can specifies which thread run first or last
        //MIN_PRIORITY , NORM_PRIORITY, MAX_PRIORITY

        MyThread1 t1 = new MyThread1("Pranshu");
        MyThread1 t2 = new MyThread1("Hrithik");
        MyThread1 t3 = new MyThread1("Kavita-Min");
        MyThread1 t4 = new MyThread1("Chetan");
        MyThread1 t5 = new MyThread1("Gaurav");
        MyThread1 t6 = new MyThread1("Kunal-(MostImportant)");
        t6.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}
