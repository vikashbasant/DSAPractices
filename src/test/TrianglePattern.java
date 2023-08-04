package test;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }


        reverseArray(array);
        printArray(array);
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

}
