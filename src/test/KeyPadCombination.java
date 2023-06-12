package test;

import java.util.ArrayList;
import java.util.List;

public class KeyPadCombination {

    public static String getCode(int num) {
        switch (num) {
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
            default:
                return "";
        }

    }

    public static List<String> letterCombinationHelper(int num) {
        // Base Case
        if (num == 0) {
            List<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        // find remainder:
        int rem = num % 10;

        // Induction Hypothesis:
        List<String> internalOutput = letterCombinationHelper(num / 10);

        // Induction Step:
        String code = getCode(rem);

        // Create finalResult:
        List<String> finalResult = new ArrayList<>();

        // traverse from the internalOutput:
        for (String element : internalOutput) {
            // traverse from the code:
            for (int i = 0; i < code.length(); i++) {
                // Concatenate and store into finalResult:
                finalResult.add(element + code.charAt(i));
            }
        }

        return finalResult;

    }

    public static List<String> letterCombination(String digits) {

        // Convert String Digit into Integer Digit:
        int digit = Integer.parseInt(digits);

        // then call letterCombinationHelper(digit) method:
        return letterCombinationHelper(digit);

    }

    public static void main(String[] args) {
        String number = "234";

        List<String> strings = letterCombination(number);

        for (String element : strings) {
            System.out.print(element + " ");
        }

    }
}
