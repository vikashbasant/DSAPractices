package multithreadingenhancement.concurrentlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThreadR2 extends Thread {

    // static instance variable:
    static ReentrantLock l = new ReentrantLock();

    // Parameterized Constructor:
    MyThreadR2(String name) {
        super(name);
    }

    // Override the run() method of the Thread Class:
    @Override
    public void run() {

        do {
            try {
                if (l.tryLock(5000, TimeUnit.MILLISECONDS)) { // => Get the Lock:

                    System.out.println(Thread.currentThread().getName() + "... got lock!");

                    Thread.sleep(30000);

                    l.unlock(); // => Release the lock:
                    System.out.println(Thread.currentThread().getName() + "... release the Lock!");
                    break;

                } else {
                    System.out.println(Thread.currentThread().getName() + "... unable to get lock! and we will try again.");
                }
            } catch (InterruptedException ignored) {
            }
        } while (true);
    }
}

public class ReentrantLockDemo2 {
    public static void main(String[] args) {
        MyThreadR2 t1 = new MyThreadR2("First Thread");
        MyThreadR2 t2 = new MyThreadR2("Second Thread");

        t1.start();
        t2.start();
    }
}
