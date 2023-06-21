package multithreadingenhancement.threadgroup;


/*Write a program to display all active thread names belongs to SystemGroup and its ChildGroup*/
public class ThreadGroupDemo4 {
    public static void main(String[] args) {

        // How to get SystemGroup:
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();

        // system.activeCount() return total active thread from the system:
        Thread[] t = new Thread[system.activeCount()];

        // copy all the active thread of a system into t:
        system.enumerate(t);

        System.out.println("==== All active thread from system and weather that particular thread isDaemon or not ====");
        for (Thread t1 : t) {
            System.out.println(t1.getName() + "---" + t1.isDaemon());
        }
    }
}
