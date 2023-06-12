package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllSubsequence {


    public static List<String> allSubsqences(String str) {

        // Base Case:
        if (str.length() == 0) {
            List<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        // Induction Hypothesis:
        List<String> internalResult = allSubsqences(str.substring(1));

        // Induction Step:
        
        // Create finalResult:
        List<String> finalResult = new ArrayList<>();
        finalResult.addAll(internalResult);

        // now add an element into finalResult:
        for (String element : internalResult) {
            finalResult.add(str.charAt(0) + element);
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        List<String> result = allSubsqences(str);
        for (String element : result) {
            System.out.print(element + " ");
        }
    }
}
