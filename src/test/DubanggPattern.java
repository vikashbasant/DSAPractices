package test;

import java.util.Scanner;

/*
=> Dubangg Pattern:
1 2 3 4 5 5 4 3 2 1
1 2 3 4 * * 4 3 2 1
1 2 3 * * * * 3 2 1
1 2 * * * * * * 2 1
1 * * * * * * * * 1
 */
public class DubanggPattern {

    public static void printDubanggPattern(int n) {
        int i = 1;
        while (i <= n) {

            // increasing number pattern:
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print(j + " ");
                j++;
            }

            // star pattern:
            int k = 1;
            while (k <= i - 1) {
                System.out.print("* ");
                k++;
            }

            // star pattern:
            int l = 1;
            while (l <= i - 1) {
                System.out.print("* ");
                l++;
            }

            // decreasing number pattern:
            int m = n - i + 1;
            while (m >= 1) {
                System.out.print(m + " ");
                m--;
            }

            // for new line:
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printDubanggPattern(n);

    }
}


