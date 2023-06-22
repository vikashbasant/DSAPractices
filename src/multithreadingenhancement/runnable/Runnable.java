package multithreadingenhancement.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements java.lang.Runnable {

    // Instance Variable:
    int num;

    // Constructor:
    MyRunnable(int num) {
        this.num = num;
    }

    // implements run() method of Runnable Interface:
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName() + " is... responsible to find sum of first " + this.num + " numbers = ");

        int sum = 0;
        for (int i = 0; i <= this.num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}

public class Runnable {

    public static void main(String[] args) {


        MyRunnable[] jobs = {
                new MyRunnable(10),
                new MyRunnable(20),
                new MyRunnable(30),
                new MyRunnable(40),
                new MyRunnable(50),
                new MyRunnable(60),
                new MyRunnable(70)
        };

        // Create ThreadPool of size 3:
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submit jobs to ThreadPool:
        for (MyRunnable job : jobs) {
            service.submit(job);
        }

        // Wait for all jobs to finish:
        service.shutdown();


    }
}
