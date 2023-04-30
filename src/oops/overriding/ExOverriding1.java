package oops.overriding;

class Parent1{
    public Object methodOne() {
        return null;
    }
}

class Child1 extends Parent1 {
    public String methodOne() {
        return null;
    }
}
public class ExOverriding1 {

    public static void main(String[] args) {

        Parent1 parent = new Parent1();
        System.out.println(parent.methodOne()); // Parent1 class methodOne is executed

        Child1 child = new Child1();
        System.out.println(child.methodOne()); // Child1 class methodOne is executed

        Parent1 parent1 = new Child1();
        System.out.println(parent1.methodOne()); // Child1 class methodOne is executed
    }
}
