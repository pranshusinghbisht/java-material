package ThreadUsingLambda;

public class ThreadDemo {
    public static void main(String[] args) {
        //First Thread: Thread - JOHN


        //we can do this beacasue Runnable is functional interface
        Runnable t = () -> {
            //this is the body of thread
            for(int i=1; i<=10; i++){
                System.out.println("Value of i is "+i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(t);
        thread.setName("JOHN");
        thread.start();

    }
}
