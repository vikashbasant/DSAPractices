package test;

import java.util.Scanner;

public class ManipulationOfArray {
    public static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }

    }

    public static void updateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 * i;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        // Before Update the Array:
        printArray(arr);

        // Update the array:
        updateArray(arr);

        // For New Line:
        System.out.println();

        // After Update the Array:
        printArray(arr);

    }
}
