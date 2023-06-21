package multithreading.deadlock;


/*
 * d1(), d2() Method of class A and class B are synchronized only.
 * */
class A1 {
    public synchronized void d1(B1 b) {
        System.out.println("Thread1 starts execution of d1() method");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread1 trying to calls B1's last() method");

        b.last();
    }

    public void last() {
        System.out.println("Inside A1, last() method");
    }
}


class B1 {
    public synchronized void d2(A1 a) {

        System.out.println("Thread2 starts execution of d2() method");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        System.out.println("Thread2 trying to calls A1's last() method");

        a.last();
    }

    public void last() {
        System.out.println("Inside B1, last() method");
    }
}

class DeadLock1 extends Thread {

    // Instance Variable:
    A1 a = new A1();
    B1 b = new B1();

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

public class DeadLockDemo1 {
    public static void main(String[] args) {
        DeadLock1 t = new DeadLock1();
        t.m1();
    }

}
