package test;

import java.util.Scanner;

public class LargestValue {
    public static int largest(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num3 >= num2) {
            return num2;
        } else {
            return num3;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int result = largest(num1, num2, num3);
        System.out.println(result);
    }
}
