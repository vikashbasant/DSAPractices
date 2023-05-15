package multitreading.tp;


class MyThread1 extends Thread {

}
public class ThreadPriorityDemo1 {
    public static void main(String[] args) {

        // Main Thread default Priority is 5, which is generated by JVM:
        // To know the current executing Thread priority:
        System.out.println("The Default Priority of Main Thread: " + Thread.currentThread().getPriority()); // 5

        // To modify the Main Thread Priority:
        Thread.currentThread().setPriority(8);

        // If we modify the Main Thread Priority with 15,
        // Then we can get RE: IllegalArgumentException
        // Because valid Thread Priority is [1-10] only otherwise we will get RE.
        // Thread.currentThread().setPriority(15);

        // Now getPriority() of current executing Thread:
        System.out.println("After modify the Main Thread priority: " + Thread.currentThread().getPriority()); // 8

        MyThread1 t = new MyThread1();

        // To know child thread priority:
        // Here child thread priority is 8, which is inherited from the Parent Thread(Main Thread)
        System.out.println("The Default Priority of Child Thread Inherited from Parent Thread(Main Thread): " + t.getPriority()); // 8
    }
}