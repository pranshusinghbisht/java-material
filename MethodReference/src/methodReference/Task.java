package methodReference;

public class Task {
    public static void doTask(){
        System.out.println("Task Method [static task]");
    }

    public static void threadTask(){
        for(int i=1; i<=10; i++){
            System.out.println(i*2);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printNumberTask(){
        System.out.println("Print Number Task[Non static task]");
    }
}
