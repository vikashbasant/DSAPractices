package multitreading.mtpt;

/**
 * Waiting Main Thread till 10 secs after that Main Thread will executing:
 */
class MyThread2 extends Thread {
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
public class ThreadJoinDemo1 {
    public static void main(String[] args) throws InterruptedException {

        MyThread1 t = new MyThread1();

        // Here new thread will create:
        t.start();


        // After executing this line of code:
        // The main thread will wait till (10000 ms == 10 secs) after that Main thread will execute.
        t.join(10000);

        // Main Thread executes this block of code Only:
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }
        
    }
}
