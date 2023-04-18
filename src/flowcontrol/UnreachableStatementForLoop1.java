package flowcontrol;

public class UnreachableStatementForLoop1 {
    public static void main(String[] args) {
        final int a = 10, b = 20;
        for (int i = 0; a < b; i++) {
            System.out.println("Hello");
        }
        // System.out.println("Hi"); // Unreachable statement
    }
}
