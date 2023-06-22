package multithreadingenhancement.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer> {

    // Instance Variable:
    int num;

    // Constructor:
    MyCallable(int num) {
        this.num = num;
    }

    // override the call() method of Callable Interface:
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " is... responsible to find sum of first " + this.num + " numbers.");

        int sum = 0;
        for (int i = 0; i <= this.num; i++) {
            sum += i;
        }

        return sum;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws Exception {


        MyCallable[] jobs = {
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(50),
                new MyCallable(60)
        };

        // Create ThreadPool of size 3:
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submit jobs to ThreadPool:
        for (MyCallable job : jobs) {
            Future<Integer> f = service.submit(job);
            System.out.println(f.get());
        }

        // Wait for all jobs to finish:
        service.shutdown();


    }
}
