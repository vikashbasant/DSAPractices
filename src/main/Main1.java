package main;

import java.util.Scanner;

public class Main1 {

    private static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    private static boolean isArmstrongNumber(int num) {

        int temp = num;
        int total = 0;

        int digit = digits(num);

        while (temp > 0) {

            int rem = temp%10;
            total += (int)Math.pow(rem, digit);
            temp /= 10;
        }
        
        return total == num;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        boolean result = isArmstrongNumber(num);
        System.out.println(result);
    }
}
