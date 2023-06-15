package test;

import java.util.Scanner;

public class CheckIsEvenOrOdd {
    public static boolean isEvenOrOdd(int number) {
        return (number & 1) == 0;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean result = isEvenOrOdd(number);
        if (result) {
            System.out.println("Number " + number + " is Even");
        } else {
            System.out.println("Number " + number + " is Odd");
        }
    }
}
