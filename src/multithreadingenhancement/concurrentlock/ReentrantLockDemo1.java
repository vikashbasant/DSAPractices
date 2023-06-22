package multithreadingenhancement.concurrentlock;

import java.util.concurrent.locks.ReentrantLock;

class MyThreadR1 extends Thread {

    // static instance variable:
    static ReentrantLock l = new ReentrantLock();

    // Parameterized Constructor:
    MyThreadR1(String name) {
        super(name);
    }

    // Override the run() method of the Thread Class:
    @Override
    public void run() {

        if (l.tryLock()) { // => if lock is available then get the lock:
            System.out.println(Thread.currentThread().getName() + " ...got lock and performing safe operations.");

            try {
                Thread.sleep(2000);
                l.unlock(); // => unlock the lock:
            } catch (InterruptedException e) {
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " unable to get lock and hence performing alternative operations.");
        }
    }
}

public class ReentrantLockDemo1 {
    public static void main(String[] args) {

        System.out.println("Main Thread Started!");

        MyThreadR1 t1 = new MyThreadR1("First Thread");
        MyThreadR1 t2 = new MyThreadR1("Second Thread");

        t1.start();
        t2.start();

        System.out.println("End Main Thread!");

    }
}
