package multithreading.dtutc;

class MyThread5 extends Thread {

    @Override
    public synchronized void start() {
        // At this line Thread class start() method will call:
        super.start(); // after this line new thread will create:

        // this line will execute by Main Thread:
        System.out.println("Here Thread class start() method is overridden!");
    }

    @Override
    public void run() {
        System.out.println("Here Thread class run() method is overridden!");
    }
}

public class ThreadDemo5 {
    public static void main(String[] args) {
        MyThread5 t = new MyThread5();

        // At this line new thread will not create:
        // this is nothing but normal method call, t.start() will call the MyThread5 class start() method:
        // this line executing by main thread only:
        t.start();

        // this line execute by main thread only:
        System.out.println("Main Thread!");

    }
}
