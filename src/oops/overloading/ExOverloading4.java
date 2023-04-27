package oops.overloading;

public class ExOverloading4 {
    public void methodOne(int i, float f) {
        System.out.println("int-float method");
    }

    public void methodOne(float f, int i) {
        System.out.println("float-int method");
    }

    public static void main(String[] args) {
        ExOverloading4 exOverloading4 = new ExOverloading4();
        exOverloading4.methodOne(10, 10.3f); // int-float method
        exOverloading4.methodOne(10.4f,23); // float-int method
        // exOverloading4.methodOne(10,10); // reference to methodOne() is ambiguous
        // exOverloading4.methodOne(13.4f, 12.4f); // reference to methodOne() is ambiguous
    }
}
