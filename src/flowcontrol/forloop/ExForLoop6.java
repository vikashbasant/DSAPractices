package flowcontrol.forloop;

public class ExForLoop6 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        for (int i = 0; a < b; i++) {
            System.out.println("Hello"); // infinite number of times this loop is going to execute.
        }
        System.out.println("Hi");
    }
}
