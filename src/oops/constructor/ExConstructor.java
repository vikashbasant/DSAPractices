package oops.constructor;

import java.io.IOException;

class Parent {
    Parent() throws IOException {
        super();
        System.out.println("Parent Class Default Constructor");
    }
}

class Child extends Parent {
    Child() throws Throwable {
        super();
        System.out.println("Child Class Default Constructor");
    }
}

public class ExConstructor {
    public static void main(String[] args) {
        try {
            Child child = new Child();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
