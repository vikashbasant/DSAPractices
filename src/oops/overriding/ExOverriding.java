package oops.overriding;

class Parent{
    public void property() {
        System.out.println("cash + land + gold");
    }

    public void marry() {
        System.out.println("xyz");
    }
}

class Child extends Parent {
    public void marry() {
        System.out.println("abc");
    }
}
public class ExOverriding {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.marry(); // Parent marry() method xyz:

        Child child = new Child();
        child.marry(); // Child marry() method abc:

        Parent parent1 = new Child();
        parent1.marry(); // Child marry() method abc:

    }
}
