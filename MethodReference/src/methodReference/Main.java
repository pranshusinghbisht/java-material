package methodReference;

public class Main {
    public static void main(String[] args) {
        System.out.println("Method Reference");

        // provide the implemetation of workInterface


        //static method refer

                                //className::methodName
        WorkInterface workInterface = Task::doTask;
        workInterface.doWork();

        Runnable runnable = Task::threadTask;
        Thread d = new Thread(runnable);
        d.start();


        //non static method refer
        //Object::methodName(without paranthesis)
        Task task = new Task();
        WorkInterface work = task::printNumberTask;
        work.doWork();



    }
}