package multithreading.dturi;

class MyRunnable4 implements Runnable {

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

public class MultiThreadingDemo4 {
    public static void main(String[] args) {

        MyRunnable4 r = new MyRunnable4();

        Thread t = new Thread(r);

        // New thread will create.
        // This t.start() method will call the Thread class .start() method will call.
        // Thread class .start() method will call .run() method of MyRunnable Class internally.
        t.start();


        // This line executes by Main Thread:
        System.out.println("Main Thread!");

        // There are total 2 threads are going to create:
    }

}
