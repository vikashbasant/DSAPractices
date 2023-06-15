package test;

import java.util.Scanner;

public class UniqueElementOfArray {
    public static int uniqueElement(int[] arr) {

        int unique = 0;
        for (int data : arr) {
            unique ^= data;
        }

        return unique;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int result = uniqueElement(arr);
        System.out.println(result);
    }
}
