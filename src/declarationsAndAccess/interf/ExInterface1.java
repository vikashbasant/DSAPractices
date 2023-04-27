package declarationsAndAccess.interf;

/**
 * A class can extends only one class at a time.
 */
public class ExInterface1 {
    public void methodOne() {
        System.out.println("Executed MethodOne");
    }
}

class Two extends ExInterface1 {
    public void methodTwo() {
        System.out.println("Executed MethodTwo");
    }

    public static void main(String[] args) {
        Two two = new Two();
        two.methodOne();
        two.methodTwo();
    }
}