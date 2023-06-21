package multithreading.itcummincation;

class ThreadE extends Thread {
    int totals = 0;

    @Override
    public void run() {

        synchronized (this) {

            System.out.println("Child thread starts calculations"); // 2

            for (int i = 1; i <= 100; i++) {
                totals += i;
            }

            System.out.println("Child thread giving notification"); // 3
            this.notify();
        }

    }
}

public class ITCommunicationDemo5 {
    public static void main(String[] args) throws InterruptedException {
        ThreadE e = new ThreadE();
        e.start();

        synchronized (e) {
            System.out.println("Main thread trying to call wait() method"); // 1
            e.wait();

            System.out.println("Main thread got notification"); // 4
            System.out.println(e.totals); // 5

        }


    }
}
