package innerclasses.anonymousinnerclasses;

/*
 * Anonymous Inner Class that implements an interface:
 *   1: Defining a Thread by implementing Runnable Interface:
 * */

// Defining a Thread by implementing Runnable Interface:
//=>> 1: Normal Class Approach: <<=//

// This MyRunnable class is nothing Defining a Thread!
class MyRunnable implements Runnable {

    // Implementing run() method of Runnable Interface:
    @Override
    public void run() {
        // Inside run() method whatever is present i.e Job of Thread!
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread!");
        }
    }
}

public class AnonymousInnerClassDemo3 {
    public static void main(String[] args) {

        // Creating an object of MyRunnable Class:
        MyRunnable r = new MyRunnable(); // =>> r is Target Runnable.

        // Creating an object of Thread Class:
        Thread t = new Thread(r);

        // new thread will start:
        t.start();

        // This block of code executed by main thread only:
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }
    }
}
