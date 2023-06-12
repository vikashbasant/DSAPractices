package test;

import java.util.Scanner;

public class IsPrime {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                
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
            System.out.println(n + " this number is prime!");
        } else {
            System.out.println(n + " this number is not prime!");
        }
    }
}
