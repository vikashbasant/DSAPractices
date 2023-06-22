package multithreadingenhancement.concurrentlock;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentLockDemo {
    public static void main(String[] args) {

        // create an object of ReentrantLock:
        ReentrantLock l = new ReentrantLock();

        // lock the ReentrantLock object:
        l.lock();
        l.lock();

        // check a weather l object is locked or not:
        System.out.println(l.isLocked()); // true
        //  Returns true if and Only if Lock is Hold by Current Thread:
        System.out.println(l.isHeldByCurrentThread()); // true
        // Returns the Number of Threads waiting for the Lock:
        System.out.println(l.getQueueLength()); // 0

        l.unlock();

        // Returns Number of Holds on this Lock by Current Thread:
        System.out.println(l.getHoldCount()); // 1
        // check a weather l object is locked or not:
        System.out.println(l.isLocked()); // true

        l.unlock();

        // check a weather l object is locked or not:
        System.out.println(l.isLocked()); // false
        // Returns true if the Lock’s Fairness Set to true.
        System.out.println(l.isFair()); // false

    }
}
