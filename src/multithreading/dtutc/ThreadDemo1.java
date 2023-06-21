package multithreading.dtutc;

/*
 * Who is the responsible to call the Main Method?
 * -> Main Thread is responsible to call Main Method.
 */

public class ThreadDemo1 {
    public static void main(String[] args) { // At this line only one thread i.e main thread

        // Thread instantiation:
        MyThread t = new MyThread();

        // It is just a normal method call:
        // So after execute this line, then 1 only thread is available, a new thread is started when we call Thread class .start() method.
        t.run(); // A separate thread doesn't be created, here we can call run () method explicity.

        // Here this for loop executed by Main thread:
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }

        // the total output produced by only Main Thread:

    }
}
