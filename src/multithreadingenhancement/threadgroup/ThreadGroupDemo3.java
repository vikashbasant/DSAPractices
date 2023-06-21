package multithreadingenhancement.threadgroup;

class MyThread extends Thread {

    // Parameterized Constructor:
    MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        System.out.println("Child Thread");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
    }
}

public class ThreadGroupDemo3 {
    public static void main(String[] args) throws InterruptedException {

        // Create ThreadGroup with specified named:
        ThreadGroup pg = new ThreadGroup("ParentGroup");

        // Create ThreadGroup with specified ThreadGroup and specified named also:
        ThreadGroup cg = new ThreadGroup(pg, "ChildGroup");

        // Create Thread with Specified ThreadGroup:
        MyThread t1 = new MyThread(pg, "ChildThread1");
        MyThread t2 = new MyThread(pg, "ChildThread2");

        // Here the Thread is started:
        t1.start();
        t2.start();

        // Returns Number of Active Threads Present in the ThreadGroup pg:
        System.out.println("Total Number of active Thread present in the pg(ThreadGroup): " + pg.activeCount()); // 2 i.e t1, t2

        //  It Returns the Number of Active ThreadGroups Present in the Current ThreadGroup.
        System.out.println("Total Number of active ThreadGroup present in the pg(ThreadGroup): " + pg.activeGroupCount()); // 1 i.e ChildGroup

        // It Prints Information about ThreadGroup to the Console.
        pg.list();

        // Thread want to sleep for 10000msec.
        Thread.sleep(10000);

        // Returns Number of Active Threads Present in the ThreadGroup
        System.out.println("Total Number of active Thread present in the pg(ThreadGroup): " + pg.activeCount()); // 0

        //  It Returns the Number of Active ThreadGroups Present in the Current ThreadGroup.
        System.out.println("Total Number of active ThreadGroup present in the pg(ThreadGroup): " + pg.activeGroupCount()); // 1 i.e ChildGroup

        // It Prints Information about ThreadGroup to the Console.
        pg.list();

    }
}
