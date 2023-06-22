package multithreadingenhancement.threadlocal;

class ParentThreadInheritable extends Thread {
    static InheritableThreadLocal tl = new InheritableThreadLocal();

    @Override
    public void run() {
        tl.set("Parent ThreadLocal Value");
        System.out.println("Parent Value: " + tl.get()); // => Parent Value: Parent ThreadLocal Value

        ChildThreadInheritable ct = new ChildThreadInheritable();
        ct.start();
    }
}

class ChildThreadInheritable extends Thread {
    @Override
    public void run() {
        // => Now by default ParentThreadInheritable local variable value by default available to ChildThreadInheritable:
        System.out.println("Child Value: " + ParentThreadInheritable.tl.get()); // => Child Value: Parent ThreadLocal Value
    }
}


public class ThreadLocalDemo4 {
    public static void main(String[] args) {
        ParentThreadInheritable pt = new ParentThreadInheritable();

        // this line executing by main thread:
        pt.start();
    }
}
