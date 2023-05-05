package oops.abstraction;

abstract class Abstraction {
    public final void sqrt(int a) {
        System.out.print("Square Root " + a + " is = ");
        System.out.println((int)Math.sqrt(a));
    }

    public abstract void add(int a, int b);
}

public class ExAbstraction extends Abstraction {

    @Override
    public void add(int a, int b) {
        System.out.println("Addition of " + a + " + " + b + " = " + (a+b));
    }

    public static void main(String[] args) {
        ExAbstraction exAbstraction = new ExAbstraction();
        exAbstraction.sqrt(4);
        exAbstraction.add(2, 4);
    }

}
