package multithreading.dturi;

class MyRunnable6 implements Runnable {

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

public class MultiThreadingDemo6 {
    public static void main(String[] args) {

        MyRunnable6 r = new MyRunnable6();

        // MyRunnable6 class implements Runnable interface which has only one method that is .run() method only.
        // And MyRunnable6 class don't have any other method.
        // That's why we will get CompileTime Error: saying start() is not available in MyRunnable6 class.
        // r.start();


        // No new thread will create.
        // When r.run() method will then MyRunnable6 class .run() method will execute,
        // It is just like a normal method call.
        // This line of code executes the Main thread only.
        r.run();

        // This line of code executes by Main Thread only.
        System.out.println("Main Thread!");
    }
}
