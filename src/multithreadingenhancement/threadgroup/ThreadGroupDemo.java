package multithreadingenhancement.threadgroup;

/*
    Every ThreadGroup in java are child group of System directly or indirectaly.
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {

        // We want to know that main thread belongs which threads group:
        System.out.println("Main Thread Belongs To Which ThreadGroup: " + Thread.currentThread().getThreadGroup().getName()); // main

        // If we want to know main thread parent thread-groups:
        System.out.println("Main Thread Parent Thread-Group: " + Thread.currentThread().getThreadGroup().getParent().getName()); // system
    }
}
