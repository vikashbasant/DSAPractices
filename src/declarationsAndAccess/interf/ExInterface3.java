package declarationsAndAccess.interf;

/**
 * A class can extend a class and can implement any number of interfaces simultaneously.
 */
public interface ExInterface3 {
    void methodOne();
}

interface RunnersInterface {
    void runnerMethod();
}

class Two2 {
    public void methodTwo() {
        System.out.println("Executed MethodTwo");
    }
}

class Three2 extends Two2 implements ExInterface3, RunnersInterface {

    @Override
    public void methodOne() {
        System.out.println("Executed MethodOne");
    }

    @Override
    public void runnerMethod() {
        System.out.println("RunnerMethod Executed");
    }

    public static void main(String[] args) {
        Three2 three2 = new Three2();
        three2.methodOne();
        three2.methodTwo();
    }
}


