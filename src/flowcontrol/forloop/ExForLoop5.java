package flowcontrol.forloop;

public class ExForLoop5 {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println("Hello"); // This loop printed infinite number of times:
        }
//        System.out.println("hi"); // unreachable statement.
    }
}
