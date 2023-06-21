package multithreading.dtutc;

/*
 * Who is the responsible to call the Main Method?
 * -> Main Thread is responsible to call Main Method.
 */

/**
 * How we can define a thread:
 * 1. extending Thread class:
 * 2. By implementing Runnable interface:
 */
class MyThread extends Thread {

    // Inside the run() method is called "JOB OF THREAD"
    @Override
    public void run() {
        // Here for loop executed by child thread:
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread!");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) { // At this line only one thread i.e main thread

        // Thread instantiation:
        MyThread t = new MyThread();

        // Starting of thread: (the Main thread starts child thread)
        t.start(); // After this lien 2 thread are there i.e main, child thread:

        // Here this for loop executed by Main thread:
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }

    }
}
