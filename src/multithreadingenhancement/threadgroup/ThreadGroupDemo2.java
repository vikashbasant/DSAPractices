package multithreadingenhancement.threadgroup;

public class ThreadGroupDemo2 {
    public static void main(String[] args) {

        // Create the ThreadGroup Object:
        ThreadGroup g1 = new ThreadGroup("tg");

        // Create the Thread with specified ThreadGroup:
        Thread t1 = new Thread(g1, "Thread1");
        Thread t2 = new Thread(g1, "Thread2");

        // Set the Max Priority of the Thread Group:
        g1.setMaxPriority(3);

        // Create the Thread with specified ThreadGroup:
        Thread t3 = new Thread(g1, "Thread3");

        // Now Simply print the priority() of the every Thread:
        System.out.println(t1.getPriority()); // 5
        System.out.println(t2.getPriority()); // 5
        System.out.println(t3.getPriority()); // 3

    }
}
