package multitreading.tp;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread!");
    }
}
public class ThreadPriorityDemo {
    public static void main(String[] args) {

        // The Default Priority of the main thread is 5:
        System.out.println("The Default Priority of Main Thread: " + Thread.currentThread().getPriority()); // 5

        // Whatever the priority of main Thread that is by default,
        // that priority available to child thread.
        MyThread t = new MyThread();
        System.out.println("The Default Priority of Child Thread Inherited from Parent Thread(Main Thread): " + t.getPriority()); // 5


    }
}
