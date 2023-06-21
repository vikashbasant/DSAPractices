package multithreading.dtutc;

class MyThread4 extends Thread {
    @Override
    public void start() {
        System.out.println("Thread Class start() method is overridden.");
    }

    @Override
    public void run() {
        System.out.println("Thread Class run() method is overridden.");
    }
}

public class ThreadDemo4 {
    public static void main(String[] args) {

        MyThread4 myThread = new MyThread4();

        // It Just like normal call: (Here it will not create new thread)
        // Here this start() method executes by Main thread only.
        myThread.start();

        System.out.println("Main Thread!");

        // output produce by only main thread:


    }
}
