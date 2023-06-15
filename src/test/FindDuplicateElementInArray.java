package test;

import java.util.Scanner;

public class FindDuplicateElementInArray {

    public static int duplicateElement(int[] arr) {
        int interMediateResult = 0;
        for (int data : arr) {
            interMediateResult ^= data;
        }

        for (int i = 1; i < arr.length; i++) {
            interMediateResult ^= i;
        }

        return interMediateResult;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int result = duplicateElement(arr);
        System.out.println(result);
    }
}
