package test;

import java.util.Scanner;

public class FindMaxAndMinOfArray {

    public static void findMaxAndMin(int[] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int data : arr) {

            // For finding the Max Value:
            /*if (data >= max) {
                max = data;
            }*/
            max = Math.max(max, data);

            // For finding the Min Value:
            if (data <= min) {
                min = data;
            }

        }

        System.out.println("max = " + max + ", min = " + min);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        findMaxAndMin(arr);
    }
}
