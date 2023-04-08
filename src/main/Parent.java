package main;


/**
 * When we run the Parent Class then output: "Parent class main Method"
 */
public class Parent {
    public static void main (String[] args) {
        System.out.println("Parent class main Method");
    }
}

/**
 * When we run the child class then the output: "Parent class main Method"
 */
class Child extends Parent {
}
