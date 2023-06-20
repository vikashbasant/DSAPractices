package multitreading.itcummincation;

class ThreadB extends Thread {
    int totals = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            totals += i;
        }
    }
}

public class ITCommunicationDemo2 {

    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();

        Thread.sleep(10000);

        // Here, in this case output, is 5050 always (because the main thread will wait for sec 10)
        System.out.println(b.totals);

    }
}
