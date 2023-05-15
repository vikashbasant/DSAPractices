package multitreading.tp;

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread!");
        }
    }
}
public class ThreadPriorityDemo2 {

    public static void main(String[] args) {

        MyThread2 t = new MyThread2();
        
        // Here we can set the child thread priority 10 which maximum priority of the thread.
        // After modifying the priority of child thread, it has max priority.
        // So it will execute before the main thread because the main thread by default priority is 5.
        t.setPriority(10);
        t.start();

        // this line executes by main thread only after complete the child thread.
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }
    }
}
