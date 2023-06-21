package multithreading.itcummincation;

class ThreadG extends Thread {
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

public class ITCommunicationDemo7 {
    public static void main(String[] args) throws InterruptedException {

        ThreadG g = new ThreadG();
        g.start();

        // Here Main Thread sleep for 10sec:
        Thread.sleep(10000);

        synchronized (g) {
            System.out.println("Main thread trying to call wait() method"); // 3

            // Now the main thread will wait 5sec for notification, after 5sec main thread start execute:
            g.wait(5000);

            System.out.println("Main thread got notification"); // 4
            System.out.println(g.totals);
        }


    }
}
