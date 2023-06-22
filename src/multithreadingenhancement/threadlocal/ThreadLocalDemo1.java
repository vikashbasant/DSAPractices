package multithreadingenhancement.threadlocal;

public class ThreadLocalDemo1 {
    public static void main(String[] args) {

        // Override the initialValue of ThreadLocal:
        ThreadLocal t = new ThreadLocal() {
            @Override
            protected Object initialValue() {
                return "abc";
            }
        };

        // Return the ThreadLocal variable related to associate with current Thread:
        System.out.println(t.get()); // => abc

        // To set new value to ThreadLocal variable related to associated with current Thread:
        t.set("Vikas");

        // Return the ThreadLocal variable related to associate with current Thread:
        System.out.println(t.get()); // => Vikas

        // Remove the Current Threads Local Variable Value
        t.remove();

        // Return the ThreadLocal variable related to associate with current Thread:
        System.out.println(t.get()); // => abc
    }
}
