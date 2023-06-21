package multithreading.mtpt;

public class ThreadJoinDemo5 {
    public static void main(String[] args) throws InterruptedException {

        // It's a trap because Main Thread will wait till Main Thread will complete their jobs.
        Thread.currentThread().join();
    }
}
