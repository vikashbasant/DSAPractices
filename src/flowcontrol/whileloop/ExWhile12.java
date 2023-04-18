package flowcontrol.whileloop;

public class ExWhile12 {
    public static void main(String[] args) {
        final int a = 10;
        while (a < 20) {
            System.out.println("hello");
        }
        // System.out.println("hi"); // this is unreachable statement
    }
}
