package multitreading.dtutc;

class MyThread1 extends Thread {

}


public class ThreadDemo2 {
    public static void main(String[] args) { // At this line only one thread i.e main thread

        // Thread instantiation:
        MyThread1 t = new MyThread1();

        // So If you extend Thread class and don't override the run() method of Thread class.
        // Then don't go multithreading concepts.
        t.start(); // This line will call run() method Thread class which has nothing implementation.

        // Here this for loop executed by Main thread:
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }

    }
}
