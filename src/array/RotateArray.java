package array;

import java.util.Scanner;

public class RotateArray {

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
     * This is Bit Optimal Approach:
     * @param arr passing arr as an argument.
     * @TimeComplexity: O(N) Where N is length of array.
     * @SpaceComplexity: O(1) it only uses a fixed amount of extra space to store the temp variable used in the swap
     * method.
     */
    private static void reverse (int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            swap(arr, i,j);
            i++;
            j--;
        }
    }

    private static void display (int[] arr) {
        for (int data : arr) {
            System.out.print(data+" ");
        }
    }

    /**
     * This method will rotate the array:
     * @param arr passing arr as an argument.
     * @param k passing k as an argument.
     * @return after rotate the array it will return the array.
     * @TimeComplexity:  O(N), where N is the length of the input array.
     * @SpaceComplexity: O(1) because it only uses a fixed amount of extra space to store variables index and arr.
     */
    private static int[] rotateArrayHelper (int[] arr, int k) {

        // Partition Array With Respect To k and reverse both partition array:
        int index = arr.length - k;

        // Reverse The Both Partition:
        reverse(arr, 0, index-1);
        reverse(arr, index,arr.length-1);

        // Finally Reverse The Whole Array:
        reverse(arr, 0, arr.length-1);

        // Simply Return Array:
        return arr;

    }

    private static int[] rotateArray(int[] arr, int k) {

        // To handle the Boundary Condition like (k > arr.length || k < 0):
        k %= arr.length;
        if(k < 0){
            k +=arr.length;
        }

        // Boundary Condition:
        if (k == 0 || k == arr.length) {
            return arr;
        }

        return rotateArrayHelper(arr, k);
    }
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int k = scan.nextInt();

        int[] result = rotateArray(arr, k);
        display(arr);
    }
}
