package multitreading.daemonthread;

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread!");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class DaemonThreadDemo1 {
    public static void main(String[] args) {

        // Create an object of MyThread1 Class:
        MyThread1 t = new MyThread1();

        // Change the daemon nature of t:

        /* If we are commented this line,
        that means both threads like main thread and t thread both are non-daemon,
        so both threads executed until their execution.*/

        /* If we are not commented this line,
         * that means the main thread is non-daemon and thread t is daemon,
         * then, whenever the main thread terminates, then automatically daemon thread will terminate.*/
        t.setDaemon(true);

        // After this line 2 thread are their:
        t.start();

        // This line executed by main thread:
        System.out.println("End of Main Thread");

    }
}
