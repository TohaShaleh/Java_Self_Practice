package Threads;

class Counter {
    int count = 0;

    // Using synchronized to ensure that only one thread can increment 'count' at a time
    public synchronized void count() {
        count++;
    }

    public int getcount() {
        return count;
    }
}

public class Race_Condition {
    public static void main(String[] args) {

        // Creating a shared Counter object for both threads to modify
        Counter c = new Counter();

        Runnable ob1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    c.count();  // Increment count in a thread-safe manner
                }
            }
        };

        Runnable ob2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    c.count();  // Increment count in a thread-safe manner
                }
            }
        };

        // Creating two threads, each executing one of the above Runnable tasks
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        // Starting both threads concurrently
        t1.start();
        t2.start();

        // Using join() to make sure the main thread waits until both threads are finished
        try {
            t1.join();  // Wait for thread t1 to finish
            t2.join();
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

        System.out.println(c.getcount());

    }
}
