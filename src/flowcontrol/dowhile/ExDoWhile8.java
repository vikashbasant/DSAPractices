package flowcontrol.dowhile;

public class ExDoWhile8 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        do {
            System.out.println("hello");
        } while (a < b);
//        System.out.println("hi"); // unreachable statement
    }
}
