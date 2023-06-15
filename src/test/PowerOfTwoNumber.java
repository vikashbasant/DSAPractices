package test;

import java.util.Scanner;

public class PowerOfTwoNumber {

    public static int clacPowers(int num1, int num2) {
        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int result = clacPowers(number1, number2);
        System.out.println(result);
    }
}
