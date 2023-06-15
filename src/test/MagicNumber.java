package test;

import java.util.Scanner;

public class MagicNumber {

    public static boolean isMagiceNo(int n) {
        int total = 0;
        while (n > 0 || total >= 9) {
            if (n == 0) {
                n = total;
                total = 0;
            }
            int rem = n % 10;
            total += rem;
            n /= 10;
        }

        return (total == 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean result = isMagiceNo(n);
        if (result) {
            System.out.println("This Number: " + n + " Magic Number");
        } else {
            System.out.println("This Number: " + n + " Not a Magic Number");

        }
    }
}
