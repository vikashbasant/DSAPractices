package test;

import java.util.Scanner;

public class NoteExchangeInto10Multiple {

    public static int digit(int ruppies) {
        int count = 0;
        while (ruppies > 0) {
            count++;
            ruppies /= 10;
        }
        return count;
    }

    public static void noteExchange(int ruppies) {
        int digit = digit(ruppies);
        int div = (int) Math.pow(10, digit - 1);
        while (ruppies > 0) {
            System.out.println((ruppies / div) + " * " + div + " = " + (ruppies / div) * div);
            ruppies %= div;
            div /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ruppies = scan.nextInt();
        noteExchange(ruppies);
    }
}
