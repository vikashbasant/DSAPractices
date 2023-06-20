package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class isValideParenthesis {
    public static boolean isValidParenthesis(String expression) {

        Map<Character, Character> chMap = new HashMap<>();
        chMap.put(')', '(');
        chMap.put(']', '[');
        chMap.put('}', '{');


        Stack<Character> st = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if ((ch == ')' || ch == ']' || ch == '}') && !st.isEmpty() && Objects.equals(st.peek(), chMap.get(ch))) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{}";
        boolean validParenthesis = isValidParenthesis(str);
        System.out.println(validParenthesis);
    }
}
