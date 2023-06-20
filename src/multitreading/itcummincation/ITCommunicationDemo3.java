package multitreading.itcummincation;

class ThreadC extends Thread {
    int totals = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            totals += i;
        }
    }
}

public class ITCommunicationDemo3 {
    public static void main(String[] args) throws InterruptedException {

        ThreadC c = new ThreadC();
        c.start();

        // Here the main thread will wait until, child thread does their execution:
        c.join();

        // Here always we are getting output as: 5050
        System.out.println(c.totals);
    }
}
