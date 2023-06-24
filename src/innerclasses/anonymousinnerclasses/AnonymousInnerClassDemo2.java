package innerclasses.anonymousinnerclasses;

/*
 * Defining a Thread by extending Thread Class: Explain
 *  1. Normal Class Approach
 *  2. Anonymous Inner Class Approach
 */

// =>>2. Anonymous Inner Class Approach: <<=
public class AnonymousInnerClassDemo2 {
    public static void main(String[] args) {

        /*
         * We have to write an anonymous Inner Class that extends Thread,
         * And we have to override the run method,
         * And for that child class, We have to create an object.
         */
        Thread t = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread!");
                }

            }
        };
        // After this line, we have two 2 threads: Main Thread, Thread-0
        t.start();

        // This for loop executed by main thread:
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }
    }
}
