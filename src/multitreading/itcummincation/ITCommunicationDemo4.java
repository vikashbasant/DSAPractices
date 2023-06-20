package multitreading.itcummincation;

class ThreadD extends Thread {
    int totals = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            totals += i;
        }
        this.notify();
    }
}

public class ITCommunicationDemo4 {
    public static void main(String[] args) throws InterruptedException {
        ThreadD d = new ThreadD();

        d.start();

        // By this line, we are getting RE: IllegalMonitorStateException.
        // Because we know that we are calling wait(), notifiy() and notifiyAll() method from synchronized area:
        d.wait();

        System.out.println(d.totals);
    }
}
