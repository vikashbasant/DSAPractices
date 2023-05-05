package top50dynamicprogrammingquestion.fibbonacciseries;

import java.util.Scanner;

public class RecursiveSolutionForFibonacciSeries {

    /**
     * Fibonacci Series of Number:
     * @TimeComplexity: O(2^n)
     * @SpaceComplexity: O(n)
     * @param num passing num as argument.
     * @return return the Nth fibonacci Number:
     */
    public static int recursive(int num) {

        // Base Case:
        if (num <= 1) {
            return num;
        }

        // Induction Hypothesis:
        int smallAnswer1= recursive(num - 1);
        int smallAnswer2 = recursive(num - 2);

        // Induction Step:
        int finalResult = smallAnswer1 + smallAnswer2;
        return finalResult;

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = recursive(n);
        System.out.println(n + "th Fibonacci Number is = " + result);





    }
}
