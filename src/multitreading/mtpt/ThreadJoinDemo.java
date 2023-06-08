package multitreading.mtpt;

/**
 * Main Thread waiting util Child Thread is Completing:
 */

class MyThread1 extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Child Thread!");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {

        MyThread1 t = new MyThread1();

        // Here new thread will create:
        t.start();


        // After executing this line of code:
        // The main thread will wait until child thread i.e (t is complete).
        t.join();

        // Main Thread executes this block of code Only:
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread!");
        }
        
    }
}
