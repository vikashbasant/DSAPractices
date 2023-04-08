package main;

/**
 * When we run the Parent1 class then output: "Parent1 main method"
 */
public class Parent1 {
    public static void main (String[] args) {
        System.out.println("Parent1 main method");
    }
}

/**
 * When we run the Child1 class then the output: "Child1 main method"
 */
class Child1 extends Parent1 {
    public static void main (String[] args) {
        System.out.println("Child1 main method");
    }
}
