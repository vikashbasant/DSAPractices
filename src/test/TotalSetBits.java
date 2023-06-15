package test;

import java.util.Scanner;

public class TotalSetBits {
    public static int setBits(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num >>= 1;
        }
        return count;
    }

    public static int findSetBits(int number1, int number2) {
        return setBits(number1) + setBits(number2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int result = findSetBits(number1, number2);
        System.out.println(result);
    }
}
