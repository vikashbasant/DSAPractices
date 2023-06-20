package multitreading.daemonthread;

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
    }
}

public class DaemonThreadDemo {
    public static void main(String[] args) {

        // Check Weather Main Thread is a Daemon or not:
        System.out.println("Is Main Thread Daemon: " + Thread.currentThread().isDaemon()); // false

        // We want to change the daemon nature of the main thread:
        // Thread.currentThread().setDaemon(true); // RE:IllegalThreadStateException

        // Create a new object:
        MyThread t = new MyThread();

        // Check Weather t Thread is a Daemon or not:
        // Thread t, inherited the nature of Daemon Thread from parent:
        System.out.println("Is MyThread Daemon, before setDaemon(): " + t.isDaemon()); // false

        // We want to change the daemon nature of the t:
        // Because we didn't start t thread, so we want to change the nature of daemon thread:
        t.setDaemon(true);

        // Check Weather t Thread is a Daemon or not:
        System.out.println("Is MyThread Daemon, after setDaemon(): " + t.isDaemon()); // true
    }
}
