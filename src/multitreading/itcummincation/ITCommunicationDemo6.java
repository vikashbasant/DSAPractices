package multitreading.itcummincation;

class ThreadF extends Thread {
    int totals = 0;

    @Override
    public void run() {
        synchronized (this) {

            System.out.println("Child thread starts calculations"); // 1

            for (int i = 1; i <= 100; i++) {
                totals += i;
            }

            System.out.println("Child thread giving notification"); // 2
            this.notify();
        }
    }
}

public class ITCommunicationDemo6 {
    public static void main(String[] args) throws InterruptedException {

        ThreadF f = new ThreadF();
        f.start();

        // Here Main Thread sleep for 10sec:
        Thread.sleep(10000);

        synchronized (f) {
            System.out.println("Main thread trying to call wait() method"); // 3
            f.wait();

            System.out.println("Main thread got notification");
            System.out.println(f.totals);
        }

        // In this program, the main thread always waits for notification:
        // so the main thread, forever wait for notification because child thread executes first in this example.
        // And child thread gives the notification, but that time the main thread will sleep:
        // to overcome this problem, we need to wait for some particular time for notification otherwise start execution
        // further.
    }
}
