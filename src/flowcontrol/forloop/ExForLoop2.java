package flowcontrol.forloop;

public class ExForLoop2 {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Hello"); // This loop printed infinite number of times:
        }
    }
}
