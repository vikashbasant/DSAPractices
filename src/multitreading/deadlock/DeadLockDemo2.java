package multitreading.deadlock;


/*
 * All Method of class A and class B are synchronized.
 * */
class A2 {
    public synchronized void d1(B2 b) {

        System.out.println("Thread1 starts execution of d1() method");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread1 trying to calls B2's last() method");
        b.last();

    }

    public synchronized void last() {
        System.out.println("Inside A2, last() method");
    }
}

class B2 {
    public synchronized void d2(A2 a) {

        System.out.println("Thread2 starts execution of d2() method");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread2 trying to calls A2's last() method");
        a.last();

    }

    public synchronized void last() {
        System.out.println("Inside B2, last() method");
    }
}

class DeadLock2 extends Thread {

    // Instance Variable:
    A2 a = new A2();
    B2 b = new B2();

    // instance method:
    public void m1() {

        // here new thread will create:
        this.start();

        // The main thread is responsible for execute this line:
        a.d1(b); // main thread
    }

    // override the run() method:
    @Override
    public void run() {
        // The child thread is responsible for execute this line:
        b.d2(a); // child thread
    }
}

public class DeadLockDemo2 {

    public static void main(String[] args) {
        DeadLock2 t = new DeadLock2();
        t.m1();
    }
}
