package declarationsAndAccess.interf;

/**
 * A class can implements any numbers of interfaces at a time.
 */
public interface ExInterface2 {
    public void methodOne();
}

interface Two1 {
    public void methodTwo();
}

class Three implements ExInterface2, Two1 {

    @Override
    public void methodOne() {
        System.out.println("Executed MethodOne");
    }
    
    @Override
    public void methodTwo() {
        System.out.println("Executed MethodTwo");
    }

    public static void main(String[] args) {
        Three three = new Three();
        three.methodOne();
        three.methodTwo();
    }
} 
