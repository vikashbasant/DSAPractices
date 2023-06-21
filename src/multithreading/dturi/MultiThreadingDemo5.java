package multithreading.dturi;

class MyRunnable5 implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("Child Thread!");
    }
}

public class MultiThreadingDemo5 {
    public static void main(String[] args) {

        MyRunnable5 r = new MyRunnable5();

        Thread t = new Thread(r);

        // No new thread will be created.
        // When t.run() method will be called then MyRunnable5 class .run() method,.
        // Just like normal method call.
        // So this line executes by Main thread only.
        t.run();


        // This line executes by Main Thread:
        System.out.println("Main Thread!");

        // There are total 1 thread is going to create:
    }

}
