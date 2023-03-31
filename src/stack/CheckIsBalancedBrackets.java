package stack;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class CheckIsBalancedBrackets {

    /**
     * this method check weather bracket are balanced or not:
     * @param str passing str as an argument.
     * @return return boolean value.
     * @TimeComplexity: The time complexity of the code is O(n), where n is the length of the input string.
     * This is because the code iterates over the entire string once, performing a constant amount of work for each character.
     *
     * @SpaceComplexity: The space complexity of the code is also O(n), where n is the length of the input string. This
     * is because the code uses a stack data structure to keep track of the opening brackets in the string, which can
     * potentially store up to n/2 brackets in the worst case scenario where all brackets are opening brackets.
     * Additionally, the code uses a boolean variable to store the result of the bracket balancing check.
     */
    private static boolean isBalancedBrackets (String str) {

        // Here we are creating result variable to hold the result weather bracket are balanced or not:
        boolean result = true;

        // Here we are creating stack: for handling the open brackets:
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            // get the character from str:
            char ch = str.charAt(i);

            // check the condition:
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    result = false;
                    break;
                }
            } else if (ch == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    result = false;
                    break;
                }
            } else if (ch == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    result = false;
                    break;
                }
            }
        }
        // Now chcek the final condition:
        if (!stack.isEmpty()) {
            result = false;
        }
        return result;
    }



    private static boolean isBalancedBrackets1 (String str) {
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            
            char ch = str.charAt(i);

            if (ch == ')' || ch == ']' || ch == '}') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(' && ch == ')') {
                        stack.pop();
                    } else if (stack.peek() == '[' && ch == ']') {
                        stack.pop();
                    } else if (stack.peek() == '{' && ch == '}') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
        }
        return stack.isEmpty();

    }


    /**
     * This method check weather bracket are balanced or not:
     * @param str passing str as an argument.
     * @return return boolean result.
     * @TimeComplexity: The time complexity of the code is O(n), where n is the length of the input string. This is 
     * because the code iterates over the entire string once, performing a constant amount of work for each character.
     *
     * @SpaceComplexity: The space complexity of the code is O(n), where n is the length of the input string. This is 
     * because the code uses a stack data structure to keep track of the opening brackets in the string, which can
     * potentially store up to n/2 brackets in the worst case scenario where all brackets are opening brackets.
     * Additionally, the code uses a hashmap data structure to store the mapping between the closing and opening
     * brackets, which can store at most 3 key-value pairs in this case. Therefore, the space complexity of the
     * hashmap is constant and does not contribute to the overall space complexity of the code.
     */
    private static boolean isBalancedBracketsBetter (String str) {

        // Boundary Condition: if the bracket length is odd that means 1 opening or closing bracket is missing:
        // that why return false:
        if (str.length() % 2 != 0) {
            return false;
        }

        // create a hashmap to store bracket in the form of key-value pair:
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put(']', '[');
        bracketMap.put('}', '{');

        // Create a stack to handle the opening bracket:
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Now check weather ch is present as key in the hashmap or not:
            if (bracketMap.containsKey(ch)) {
                // Now check weather stack is empty or stack.peek() != bracketMap.get(ch) if any of the condition is
                // ture then simply return false:
                if (st.isEmpty() || !st.pop().equals(bracketMap.get(ch))) {
                    return false;
                }
            } else {
                st.push(ch);
            }
        }
        return st.isEmpty();


    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean result = isBalancedBracketsBetter(str);
        System.out.println(result);
    }

}
