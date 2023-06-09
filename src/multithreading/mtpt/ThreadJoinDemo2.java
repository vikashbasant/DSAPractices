package multithreading.mtpt;

/**
 * Waiting of child Thread until completing main Thread:
 */
class MyThread3 extends Thread {

    // Instance variable of class MyThread3:
    public static Thread mt;

    @Override
    public void run() {

        try {
            // After executing this line of code:
            // The Child Thread is waited until the Main thread will execute.
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread!");
        }

    }
}

public class ThreadJoinDemo2 {
    public static void main(String[] args) throws InterruptedException {

        // Here we need assign MyThread3.mt variable:
        MyThread3.mt = Thread.currentThread();

        MyThread3 t = new MyThread3();

        // Here new thread will create:
        t.start();


        // Main Thread executes this block of code Only:
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            System.out.println("Main Thread!");
        }

    }
}
