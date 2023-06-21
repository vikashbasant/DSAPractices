package multithreading.mtpt;

class MyThread6 extends Thread {
    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("I am lazy Thread = " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("I got interrupted!");
        }

    }
}

public class ThreadInterruptDemo {

    public static void main(String[] args) {
        MyThread6 t = new MyThread6();

        // Here new thread will create:
        t.start();

        // The main thread interrupts the child thread.
        // If child thread is sleeping() state or waiting() state:
        t.interrupt();

        System.out.println("end of main thread!");
    }
}
