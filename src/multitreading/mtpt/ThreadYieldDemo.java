package multitreading.mtpt;

/**
 * In this example,
 * <code>Thread.yield()</code> always call inside the run()
 * method that means the number of chances Main Thread code of block will execute.
 * <p/>
 * <p/>
 * If we comment on the line <code>Thread.yield()</code> method,
 * then we can't expect exact output because both child and main thread have the same priority.
 *
 */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // prevent the execution of child thread:
            Thread.yield();
            System.out.println("Child Thread!");
        }
    }
}
public class ThreadYieldDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        // New child thread will we created:
        t.start();

        // Main thread executes this block of code only:
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread!");
        }
    }
}
