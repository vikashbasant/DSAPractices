package array;

import java.util.Scanner;

public class ReverseArray {

    private static void display (int[] array) {
        for (int data : array) {
            System.out.print(data+" ");
        }
    }

    /**
     * Swap the array element:
     * @param arr passing arr as an argument.
     * @param i passing index i as an argument.
     * @param j passing index j as an argument.
     * @TimeComplexity: O(1) it performs a fixed number of operations, regardless of the size of the input.
     * @SpaceComplexity: O(1)
     */
    private static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * This is Brut Force Approach:
     * @param arr passing arr as an argument.
     * @TimeComplexity: O(N) Where N is length of array.
     * @SpaceComplexity: O(1) it only uses a fixed amount of extra space to store the temp variable used in the swap
     * method.
     */
    private static void reverse (int[] arr) {
        for (int i = 0; i < (arr.length / 2); i++) {
            swap(arr, i, arr.length-1-i);
        }
    }

    /**
     * This is Bit Optimal Approach:
     * @param arr passing arr as an argument.
     * @TimeComplexity: O(N) Where N is length of array.
     * @SpaceComplexity: O(1) it only uses a fixed amount of extra space to store the temp variable used in the swap
     * method.
     */
    private static void reverseBetter (int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            swap(arr, i,j);
            i++;
            j--;
        }
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        reverseBetter(arr);
        display(arr);
    }
}
