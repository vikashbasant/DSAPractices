package multithreadingenhancement.threadlocal;

class ParentThread extends Thread {
    static ThreadLocal tl = new ThreadLocal();

    @Override
    public void run() {
        tl.set("Parent ThreadLocal Value");
        System.out.println("Parent Value: " + tl.get()); // => Parent Value: Parent ThreadLocal Value

        ChildThread ct = new ChildThread();
        ct.start();
    }
}

class ChildThread extends Thread {
    @Override
    public void run() {
        // => by default ParentThread local variable value by default not available to ChildThread:
        System.out.println("Child Value: " + ParentThread.tl.get()); // => Child Value: null
    }
}


public class ThreadLocalDemo3 {
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();

        // this line executing by main thread:
        pt.start();
    }
}
