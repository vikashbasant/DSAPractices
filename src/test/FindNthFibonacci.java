package test;

import java.util.Scanner;

public class FindNthFibonacci {
    public static int nthFibonacci(int num) {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= num; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = nthFibonacci(num);
        System.out.println(result);

    }
}
