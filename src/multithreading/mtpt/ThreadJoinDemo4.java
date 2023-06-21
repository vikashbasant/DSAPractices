package multithreading.mtpt;

/**
 * If main thread calls join() on child thread object and child thread called join() on the main
 * thread object, then both threads will wait for each other forever and the program will be
 * hanged.
 * <p>
 * <p/>
 * <p/>
 * (like deadlock if a Thread class join() method on the same thread itself then the
 * program will be hanged ).
 */

class MyThread5 extends Thread {
    public static Thread mt;

    @Override
    public void run() {
        try {
            // Child Thread will wait until Main Thread complete it's work.
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // This Code block executing by Child Thread:
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread!");
        }

    }
}

public class ThreadJoinDemo4 {

    public static void main(String[] args) throws InterruptedException {
        MyThread5.mt = Thread.currentThread();

        MyThread5 t = new MyThread5();
        t.start();

        // Main Thread will wait until Child Thread complete it's work:
        t.join();

        // This Code block executing by Main Thread:
        for (int i = 0; i < 5; i++) {
            System.out.println("MainThread!");
        }
    }

}
