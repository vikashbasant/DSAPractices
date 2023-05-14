package multitreading.dturi;

class MyRunnable3 implements Runnable {

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
public class MultiThreadingDemo3 {
    public static void main(String[] args) {

        Thread t = new Thread();

        // No new thread will be created.
        // It is just called this method as a normal method,
        // Inside the Thread class .run() method already overridden,
        // Because Thread class implements Runnable Interface which has only one run()
        // With Empty Implementation.
        // So the output is nothing.
        t.run();



        // This line executes by Main Thread:
        System.out.println("Main Thread!");

        // There are total 1 threads are going to create:
    }

}
