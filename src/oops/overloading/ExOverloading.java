package oops.overloading;

public class ExOverloading {
    public void methodOne() {
        System.out.println("no-arg method");
    }

    public void methodOne(int i) {
        System.out.println("int-arg method");
    }

    public void methodOne(double d) {
        System.out.println("double-arg method");
    }

    public static void main(String[] args) {
        ExOverloading exOverloading = new ExOverloading();
        exOverloading.methodOne(); // no-arg method
        exOverloading.methodOne(10); // int-arg method
        exOverloading.methodOne(10.9); // double-arg method
    }

}
