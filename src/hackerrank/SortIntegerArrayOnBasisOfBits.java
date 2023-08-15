package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntegerArrayOnBasisOfBits {

    public static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    public static void bitSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i])*10001;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] %=10001;
        }

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        bitSort(arr);
        printArray(arr);

    }
}
