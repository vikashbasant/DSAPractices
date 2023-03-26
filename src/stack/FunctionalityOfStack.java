package stack;

import java.util.Stack;

public class FunctionalityOfStack {
    public static void main (String[] args) {

        // Initialize the stack:
        Stack<Integer> stack = new Stack<>();

        // Adding element into stack:
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Print the Stack:
        System.out.println("Stack are = " + stack);

        // Peek Element Of Stack:
        System.out.println("Peek Element of the Stack = " + stack.peek());

        // Print the size of the Stack:
        System.out.println("Size of the stack = " + stack.size());

        // Iterate Over the Stack:
        while (!stack.isEmpty()) {
            System.out.println("Stack -> " + stack + ", Peek Element -> " + stack.peek() + ", Size Of Stack -> " + stack.size());
            System.out.println("Remove Top Element Of Stack = " + stack.pop());
        }

    }
}
