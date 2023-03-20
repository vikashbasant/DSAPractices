package array;

import java.util.Scanner;

public class SpanOfAnArray {

    /**
     * Span of Array i.e (Maximum Element - Minimum Element) of Array:
     * TimeComplexity: O(N) where N is the length of the input array
     * SpaceComplexity: O(1)
     * @param arr passing array as an argument.
     * @return return difference of max-min element of array:
     */
    private static int spanOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            max = (element > max) ? element : max;
            min = (element < min) ? element : min;
        }


        // Span means (maximum element - minimum element) of array:
        return max - min;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int result = spanOfArray(arr);
        System.out.println("Span of Array = " + result);
    }
}
