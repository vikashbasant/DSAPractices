package multithreadingenhancement.threadlocal;

public class ThreadLocalDemo {
    public static void main(String[] args) {

        ThreadLocal t = new ThreadLocal();

        // Return the ThreadLocal variable related to associate with current Thread:
        // t.get() method internally call initialValue() method of the ThreadLocal class:
        System.out.println(t.get()); // => null

        // To set new value to ThreadLocal variable related to associated with current Thread:
        t.set("Vikas");

        // Return the ThreadLocal variable related to associate with current Thread:
        System.out.println(t.get()); // => Vikas

        // Remove the Current Threads Local Variable Value
        t.remove();

        // Return the ThreadLocal variable related to associate with current Thread:
        System.out.println(t.get()); // => null
    }
}
