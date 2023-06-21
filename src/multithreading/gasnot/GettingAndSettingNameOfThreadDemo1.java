package multithreading.gasnot;

/**
 * We can get a current executing thread object by using <code>Thread.currentThread()</code> method.
 */

class MyThread1 extends Thread {
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     */
    @Override
    public void run() {
        System.out.println(".run() method executed by Thread: " + Thread.currentThread().getName());
    }
}

public class GettingAndSettingNameOfThreadDemo1 {

    public static void main(String[] args) {
        MyThread1 t = new MyThread1();

        t.start(); // After this line 2 thread is created i.e (main, Thread-0)

        // The Main Thread is responsible to execute this line:
        System.out.println("main() method executed by Thread: " + Thread.currentThread().getName());
    }
}
