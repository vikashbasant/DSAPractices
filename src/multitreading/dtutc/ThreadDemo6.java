package multitreading.dtutc;

class MyThread6 extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread!");
    }
}
public class ThreadDemo6 {
    public static void main(String[] args) {
        MyThread6 t = new MyThread6();

        // start the new thread:
        t.start(); // valid
        
        // this line execute by main thread only:
        System.out.println("Main Thread!");

        // Restart the same thread is not possible otherwise we will get RuntimeError: IllegalThreadStateException
        t.start(); // invalid
    }
}
