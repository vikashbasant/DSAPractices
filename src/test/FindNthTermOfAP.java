package test;

import java.util.Scanner;

public class FindNthTermOfAP {

    public static int nThTermOfAP(int n) {
        return 3 * n + 7;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = nThTermOfAP(n);
        System.out.println(result);
    }
}
