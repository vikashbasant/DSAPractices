package innerclasses.anonymousinnerclasses;

/*
 * Anonymous Inner Class that implements an interface:
 *   1: Defining a Thread by implementing Runnable Interface:
 */

// Defining a Thread by implementing Runnable Interface:
// =>>2. Anonymous Inner Class Approach: <<=
public class AnonymousInnerClassDemo4 {
    public static void main(String[] args) {

        /*
         * here we are not creating for
         * Runnable interface, we are creating
         * implement a class object.
         */
        Runnable r = new Runnable() {

            // Implements run() method Runnable Interface:
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread!");
                }
            }
        };

        // Creating an object of Thread Class:
        Thread t = new Thread(r); // Here r: Target Runnable.

        // at this line new thread will we created:
        t.start();

        // This block of code executed by main thread only:
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
