package oops.overloading;

public class ExOverloading2 {
    public void methodOne(String s) {
        System.out.println("String version");
    }

    public void methodOne(Object obj) {
        System.out.println("Object version");
    }

    public static void main(String[] args) {
        ExOverloading2 exOverloading2 = new ExOverloading2();
        exOverloading2.methodOne("Vikas"); // String version
        exOverloading2.methodOne(new Object()); // Object version
        exOverloading2.methodOne(null); // String version
    }
}
