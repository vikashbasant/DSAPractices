package flowcontrol.dowhile;

public class ExDoWhile10 {
    public static void main(String[] args) {
        final int a = 10, b = 20;
        do {
            System.out.println("hello");
        } while (a < b);
//        System.out.println("hi"); // unreachable statement
    }
}
