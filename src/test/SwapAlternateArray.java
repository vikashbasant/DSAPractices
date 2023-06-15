package test;

import java.util.Scanner;

public class SwapAlternateArray {

    public static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i + 1 < arr.length) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        swapAlternate(arr);
        printArray(arr);
    }
}
