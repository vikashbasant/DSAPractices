package multithreadingenhancement.threadlocal;


class CustomerThread extends Thread {

    // static instance variable:
    static Integer custId = 0;

    // Creating ThreadLocal Object with override the initialValue:
    private static final ThreadLocal tl = new ThreadLocal() {

        // Override the initialValue of ThreadLocal:
        @Override
        protected Integer initialValue() { // => ine 2
            return ++custId;
        }

    };

    // Constructor:
    CustomerThread(String name) {
        super(name);
    }

    // Here we are implements the run() method of the Runnable Interface,
    // tl.get() method internally invoked the initialValue() ThreadLocal class:
    // So each time custId incremented by 1:
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing with customerId: " + tl.get()); // => line 1
    }
}

public class ThreadLocalDemo2 {
    public static void main(String[] args) {

        CustomerThread c1 = new CustomerThread("Customer Thread-1");
        CustomerThread c2 = new CustomerThread("Customer Thread-2");
        CustomerThread c3 = new CustomerThread("Customer Thread-3");
        CustomerThread c4 = new CustomerThread("Customer Thread-4");

        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }
}
