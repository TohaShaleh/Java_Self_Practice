package Threads;

public class MultiThreaded_Task {
    public static void main(String[] args) {
        System.out.println("Task 1 started executing\n");

        Thread t1=new Thread(()->{
            task1();
        });

        System.out.println("Task 2 started executing\n");

        Thread t2=new Thread(()->{
            task2();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Both completed their execution");

    }


    public static void task1()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println("Task1 has been completed\n");
    }

    public static void task2()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println("Task2 has been completed\n");
    }


}
