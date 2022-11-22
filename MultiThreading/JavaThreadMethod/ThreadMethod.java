package JavaThreadMethod;
class myThread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am thread 1");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class myThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am thread 2");
        }
    }
}

    public class ThreadMethod {
        public static void main(String[] args) {
            myThread1 t1 = new myThread1();
            myThread2 t2 = new myThread2();
        t1.start();
        // if i want to start t1 first then t2 we will use join() method
        //    t1.join();  this will throw error probably
            try {
                t1.join();
            }
            catch (Exception e){
                System.out.println(e);
            }
            t2.start();
        }
    }


    // sleep() method -> sleep for some seconds

// thread is not invented by java -> fact (it is a topic of OS)
