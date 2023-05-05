package top50dynamicprogrammingquestion.fibbonacciseries;

import java.util.Scanner;

public class IterativeSolutionForFibonacciSeries {

    public static int printNthFibonacciNumber(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
        return b-a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = printNthFibonacciNumber(n);
        System.out.println();
        System.out.println(n + "th Fibonacci Number is = " + result);
    }
}
