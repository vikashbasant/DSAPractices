package multitreading.mtpt;

public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("M");
        Thread.sleep(3000);
        System.out.println("E");
        Thread.sleep(3000);
        System.out.println("G");
        Thread.sleep(3000);
        System.out.println("A");
    }
}
