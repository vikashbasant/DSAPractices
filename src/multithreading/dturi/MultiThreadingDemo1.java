package multithreading.dturi;

class MyRunnable1 implements Runnable {

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
        System.out.println("MyRunnable1 Thread!");
    }
}

public class MultiThreadingDemo1 {
    public static void main(String[] args) {

        MyRunnable1 r = new MyRunnable1();

        // New thread will create.
        // By this line t.start() will call the Thread class .run() method which has empty implementation so output is nothing.
        Thread t = new Thread();
        t.start();

        // New thread will create.
        // By this line t1.start() will call the MyRunnable1 class .run() method.
        Thread t1 = new Thread(r); // Here 'r' is nothing but target Runnable.
        t1.start();

        // This line of code will execute by main thread only.
        System.out.println("Main Thread!");

        // So total there are 3 threads will be created.
    }
}
