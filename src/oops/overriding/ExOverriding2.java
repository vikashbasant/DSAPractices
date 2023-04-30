package oops.overriding;

class Parent2 {
    private void methodOne() {
        System.out.println("This private method we can't override");
    }

}

class Child2 extends Parent3 {
    private void methodOne() {
        System.out.println("This is not overriding method");
    }
}
public class ExOverriding2 {

    public static void main(String[] args) {

    }
}
