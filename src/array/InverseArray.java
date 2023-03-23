package array;

import java.util.Scanner;

public class InverseArray {
    private static void display (int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    /**
     * This method used to inverse the Array:
     * @param arr passing arr as an argument.
     * @return return result of inverse of the array.
     * @TimeComplexity time complexity of the given code is O(n), where n is the length of the input array.
     * @SpaceComplexity space complexity of the code is O(n), where n is the length of the input array.
     */
    private static int[] inverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[arr[i]] = i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int[] result = inverse(arr);
        display(result);
    }
}
