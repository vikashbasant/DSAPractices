package multithreadingenhancement.concurrentlock;

import java.util.concurrent.locks.ReentrantLock;

/* In this example, in the place synchronized keywords,
we are using ReentrantLock concepts.
* */

/*
 * If we comment line 1 and line 2 then, the thread will we executed simultaneously, and we will get irregular output.
 * If we are not comment line 1 and line 2, then the thread will we executed one by one, and we will get regular output.
 * */
class DisplayR {

    // Create a ReentrantLock Object:
    ReentrantLock l = new ReentrantLock();

    public void wish(String name) {

        // Get the lock:
        l.lock(); // => line 1

        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning! ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            System.out.println(name);
        }

        // unlock the lock():
        l.unlock(); // => line2
    }
}

class MyThreadR extends Thread {

    // Instance Variable:
    DisplayR d;
    String name;

    // Parameterized Constructor:
    MyThreadR(DisplayR d, String name) {
        this.d = d;
        this.name = name;
    }

    // Override the run() method from the Thread Class:
    @Override
    public void run() {
        d.wish(this.name);
    }
}

public class ReentrantLockDemo {

    public static void main(String[] args) {

        System.out.println("Start the Main Thread");

        DisplayR display = new DisplayR();

        MyThreadR t1 = new MyThreadR(display, "Dhoni");
        MyThreadR t2 = new MyThreadR(display, "Yuvraj");
        MyThreadR t3 = new MyThreadR(display, "Kohli");

        // we are getting regular output:
        t1.start();
        t2.start();
        t3.start();

        // this line execute by main thread:
        System.out.println("End Of Main Thread!");
    }
}
