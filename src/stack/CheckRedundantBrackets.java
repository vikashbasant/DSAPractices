package stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckRedundantBrackets {

    private static boolean isRedundantBracket (String str) {
        Stack<Character> stack = new Stack<>();
        boolean isRedundant = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ')') {
                stack.push(str.charAt(i));
            } else {
                int count = 0;
                while (!stack.isEmpty()) {
                    if (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '%') {
                        count++;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    stack.pop();
                }
                if (count == 0) {
                    isRedundant = true;
                    break;
                }

            }

        }
        return isRedundant;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean result = isRedundantBracket(str);
        System.out.println("isRedundantBracket = " + result);
    }
}
