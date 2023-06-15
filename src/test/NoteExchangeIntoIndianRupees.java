package test;

import java.util.Scanner;

public class NoteExchangeIntoIndianRupees {
    protected static final int[] RUPEES = {2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public static void exchange(int num) {


        for (int i = 0; num > 0 && i < RUPEES.length; i++) {
            if (num / RUPEES[i] != 0) {
                System.out.println(RUPEES[i] + " * " + (num / RUPEES[i]) + " = " + RUPEES[i] * (num / RUPEES[i]));
                num %= RUPEES[i];
            }
        }

    }

    public static void exchangeSwitches(int num) {
        switch (1) {
            case 1:
                System.out.println("100 * " + (num / 100) + " = " + 100 * (num / 100));
                num %= 100;
            case 2:
                System.out.println("50 * " + (num / 50) + " = " + 50 * (num / 50));
                num %= 50;
            case 3:
                System.out.println("20 * " + (num / 20) + " = " + 20 * (num / 20));
                num %= 20;
            case 4:
                System.out.println("1 * " + (num) + " = " + (num));
                num %= 1;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // exchange(n);
        exchangeSwitches(n);

    }
}
