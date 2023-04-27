package oops.overloading;

public class ExOverloading1 {
    public void methodOne(int i) {
        System.out.println("int-arg method executed");
    }

    public void methodOne(float f) {
        System.out.println("float-arg method executed");
    }

    public static void main(String[] args) {
        ExOverloading1 exOverloading1 = new ExOverloading1();
        exOverloading1.methodOne('a'); // int-arg method executed
        exOverloading1.methodOne(10l); // float-arg method executed
        // exOverloading1.methodOne(10.5); // no suitable method found for methodOne(double)
    }
}
