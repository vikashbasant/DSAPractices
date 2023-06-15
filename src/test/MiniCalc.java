package test;

import java.util.Scanner;

public class MiniCalc {

    public static int calculate(int number1, int number2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '%':
                result = number1 % number2;
                break;
            default:
                System.out.println("Please enter valid operator!");

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        char ch = scan.next().charAt(0);

        int result = calculate(number1, number2, ch);
        System.out.println(result);
    }
}

