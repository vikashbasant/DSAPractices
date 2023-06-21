package multithreadingenhancement.threadgroup;

public class ThreadGroupDemo1 {
    public static void main(String[] args) {

        ThreadGroup g = new ThreadGroup("First Group");

        // We want to know a group g parent thread group name:
        System.out.println("g parent group name: " + g.getParent().getName()); // main

        //============================================================================================================//

        ThreadGroup g1 = new ThreadGroup(g, "Second Group");

        // We want to know a group g1 parent thread group name:
        System.out.println("g1 Parent group name: " + g1.getParent().getName()); // First Group
    }
}
