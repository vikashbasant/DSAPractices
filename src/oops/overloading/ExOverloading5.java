package oops.overloading;

public class ExOverloading5 {
    public void methodOne(int i) {
        System.out.println("General Method");
    }

    public void methodOne(int... i) {
        System.out.println("var-arg method");
    }

    public static void main(String[] args) {
        ExOverloading5 exOverloading5 = new ExOverloading5();
        exOverloading5.methodOne(1); // General Method
        exOverloading5.methodOne(12,12,13); // var-arg method
        exOverloading5.methodOne(); // var-arg method
    }
}
