package multithreading.stopthread;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {

            }
        }
    }
}

public class StopThreadDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();

        // After this line, there are total 2 Thread:
        t.start();

        // After t.start() all the line of code execute by main thread only:
        System.out.println("End Of Main Thread");

        // Stop the thread, manually:
        t.stop();
        t.suspend();

    }
}
