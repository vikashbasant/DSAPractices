package multithreading.dturi;

class MyRunnable2 implements Runnable {

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

public class MultiThreadingDemo2 {
    public static void main(String[] args) {

        Thread t = new Thread();

        // Here new thread will start: call the .start() method of Thread class
        // Which is internally call .run() method is overridden in the Thread Class
        // Which has empty implementation. So Output is nothing.
        t.start();

        // This line executes by Main Thread:
        System.out.println("Main Thread!");

        // There are total 2 threads are going to create:
    }

}
