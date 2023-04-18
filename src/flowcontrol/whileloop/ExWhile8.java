package flowcontrol.whileloop;

public class ExWhile8 {
    public static void main(String[] args) {
        final int a = 10, b = 20;
        while (a < b) {
            System.out.println("hello");
        }
//        System.out.println("hi"); // this is unreachable statement
    }
}
