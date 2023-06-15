package test;

import java.util.Scanner;

public class CalcNCR {

    public static int fact(int num) {
        
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int ncr(int n, int r) {
        int factN = fact(n);
        int factR = fact(r);
        int factNR = fact(n - r);

        return factN / (factNR * factR);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int result = ncr(n, r);
        System.out.println(result);
    }
}
