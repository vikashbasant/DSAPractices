package test;

import java.util.Scanner;

public class IsPrime {

    public static boolean isPrime(int n) {
        for (int div = 2; div <= Math.sqrt(n); div++) {
            if (n % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean result = isPrime(n);
        if (result) {
            System.out.println(n + " this number Prime!");
        } else {
            System.out.println(n + " this number not Prime!");
        }
    }
}
