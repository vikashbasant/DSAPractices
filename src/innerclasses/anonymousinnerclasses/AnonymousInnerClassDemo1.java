package innerclasses.anonymousinnerclasses;

/*
 * Defining a Thread by extending Thread Class: Explain
 *  1. Normal Class Approach
 *  2. Anonymous Inner Class Approach
 */

//=>> 1: Normal Class Approach: <<=//

// This MyThread class is nothing Defining a Thread!
class MyThread extends Thread {
    @Override
    public void run() {
        // Inside run() method whatever is present i.e Job of Thread!
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread!");
        }
    }
}

public class AnonymousInnerClassDemo1 {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        // This line executed by main thread only:
        t.start();

        // This line code executed by main thread only:
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }

    }
}
