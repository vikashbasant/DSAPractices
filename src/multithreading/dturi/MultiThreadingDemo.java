package multithreading.dturi;

class MyRunnable implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        // Everything inside run() method is known as "JOB OF THREAD"
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread!");
        }
    }
}


public class MultiThreadingDemo {
    public static void main(String[] args) {

        // Create an object of MyRunnable Class:
        MyRunnable r = new MyRunnable();

        // Create an object of Thread Class which is implement Runnable Interface:
        // By passing MyRunnable Class object into a Thread Class object,
        // When we call t.start() then MyRunnable class method .run() will call,
        // But not call the Thread Class .run() method.
        Thread t = new Thread(r); // Here r is nothing but target Runnable

        // Create a new Thread, call the MyRunnable Class .run() method
        // But not call the Thread Class .run() method:
        t.start();

        // This Block of code execute by Main Thread Only.
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread!");
        }

    }
}
