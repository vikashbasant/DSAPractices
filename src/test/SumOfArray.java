package test;

import java.util.Scanner;

public class SumOfArray {
    public static int sumArrays(int[] arr) {
        int total = 0;
        for (int data : arr) {
            total += data;
        }
        return total;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int result = sumArrays(arr);
        System.out.println(result);
    }
}
