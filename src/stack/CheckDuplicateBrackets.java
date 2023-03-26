package stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckDuplicateBrackets {

    /**
     * This method tell weather given string regular expression bracket are duplicate or redundant or not:
     * @param str passing str as an argument.
     * @return return boolean result.
     * @TimeComplexity: The time complexity of this code is O(n), where n is the length of the input string str.
     * This is because the code is iterating over each character of the string once, and each operation inside the
     * for loop takes constant time.
     *
     * @SpaceComplexity: The space complexity of this code is O(n), where n is the length of the input string str. This
     * is because the size of the stack can grow up to the length of the input string in the worst case, where all
     * characters are opening brackets. In addition, the boolean variable isDuplicate takes constant space.
     */
    private static boolean isDuplicateBracket(String str) {

        Stack<Character> stack = new Stack<>();
        boolean isDuplicate = false;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ')') {

                if (!stack.isEmpty() && stack.peek() == '(') {
                    isDuplicate = true; // That mean this bracket is duplicate:
                    break;

                } else {
                    // pop the element until '(' not found:
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        stack.pop();
                    }
                    // Finally pop the opening bracket i.e '(':
                    stack.pop();
                }
            } else {
                // If character is anything but not ')' closing bracket, then simply push the element into stack:
                stack.push(str.charAt(i));
            }
        }
        return isDuplicate;

    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean result = isDuplicateBracket(str);
        System.out.println("is Duplicate Bracket = " + result);
    }
}
