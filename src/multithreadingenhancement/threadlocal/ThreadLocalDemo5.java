package multithreadingenhancement.threadlocal;

class ParentThreadE extends Thread {
    static InheritableThreadLocal tl = new InheritableThreadLocal() {
        public Object childValue(Object pValue) {
            return "Child ThreadLocal Value";
        }
    };

    @Override
    public void run() {
        tl.set("Parent ThreadLocal Value");
        System.out.println("Parent Value: " + tl.get()); // => Parent Value: Parent ThreadLocal Value

        ChildThreadE ct = new ChildThreadE();
        ct.start();
    }
}

class ChildThreadE extends Thread {
    @Override
    public void run() {
        // => Now by default ParentThreadE local variable value by default available to ChildThreadE:
        // but we want customized ParentThreadE local variable value to ChildThreadE:
        System.out.println("Child Value: " + ParentThreadE.tl.get()); // => Child Value: Child ThreadLocal Value
    }
}


public class ThreadLocalDemo5 {
    public static void main(String[] args) {
        ParentThreadE pt = new ParentThreadE();

        // this line executing by main thread:
        pt.start();
    }
}
