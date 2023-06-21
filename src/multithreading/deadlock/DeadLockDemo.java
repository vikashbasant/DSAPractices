package multithreading.deadlock;

/*
 * All Method of class A and class B are not synchronized.
 * */
class A {
    public void d1(B b) {

        System.out.println("Thread1 starts execution of d1() method");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread1 trying to calls B's last() method");

        b.last();

    }

    public void last() {
        System.out.println("Inside A, last() method");
    }
}


class B {
    public void d2(A a) {

        System.out.println("Thread2 starts execution of d2() method");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread2 trying to calls A's last() method");

        a.last();
    }

    public void last() {
        System.out.println("Inside B, last() method");
    }
}

class DeadLock extends Thread {

    // Instance Variable:
    A a = new A();
    B b = new B();

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

public class DeadLockDemo {

    public static void main(String[] args) {
        DeadLock t = new DeadLock();
        t.m1();
    }

}

