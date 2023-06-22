package multithreadingenhancement.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {

    // Instance Variable:
    String name;

    // Parameterized Constructor:
    PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + "....Job Started By Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        System.out.println(name + "....Job Completed By Thread: " + Thread.currentThread().getName());
    }
}

public class ThreadPoolDemo {
    public static void main(String[] args) {

        PrintJob[] jobs = {
                new PrintJob("Vikash"),
                new PrintJob("Ravi"),
                new PrintJob("Shiva"),
                new PrintJob("Suresh"),
                new PrintJob("Anil")
        };

        // Create ExecutorService:
        // => Here Three threads are responsible to perform 6 jobs:
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit jobs to ExecutorService:
        for (PrintJob job : jobs) {
            executorService.submit(job);
        }

        // Shutdown ExecutorService:
        executorService.shutdown();
    }
}
