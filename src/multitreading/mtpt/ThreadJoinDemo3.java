package multitreading.mtpt;

/**
 * Waiting of child Thread until a certain period of time:
 */
class MyThread4 extends Thread {

    // Instance variable of class MyThread3:
    public static Thread mt;

    @Override
    public void run() {

        try {
            // After executing this line of code:
            // The Child Thread is waited till certain time period:
            mt.join(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread!");
        }

    }
}
public class ThreadJoinDemo3 {
    public static void main(String[] args) throws InterruptedException {

        // Here we need assign MyThread3.mt variable:
        MyThread4.mt = Thread.currentThread();

        MyThread4 t = new MyThread4();

        // Here new thread will create:
        t.start();


        // Main Thread executes this block of code Only:
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            System.out.println("Main Thread!");
        }
        
    }
}
