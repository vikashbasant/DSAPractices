package test;

import java.util.Scanner;

public class PrintCount {
    public static void countPrint(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        countPrint(num);

    }
}
