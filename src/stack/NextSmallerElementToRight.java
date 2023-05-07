package stack;

import java.util.Scanner;
import java.util.Stack;

public class NextSmallerElementToRight {

    public static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    /**
     * Find Next Smaller Element To Right: (Apply Brute Force Approach)
     * @param arr passing arr as an argument.
     * @return return result as array.
     * @TimeComplexity: O(N^2)
     * @SpaceComplexity: O(N)
     */
    public static int[] findNSEToRight(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int min = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    break;
                }
            }
            result[i] = min;
        }
        return result;
    }

    /**
     * Find Next Smaller Element To Right: (Using Stack, traverse the array right to left)
     * @param arr passing arr as an argument.
     * @return return result as array.
     * @TimeComplexity: O(N)
     * @SpaceComplexity: O(N)
     */
    public static int[] findNSEToRightApproach1(int[] arr) {

        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else if (stack.peek() < arr[i]) {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    /**
     * Find Next Smaller Element To Right: (Using Stack, traverse the array left to right)
     * @param arr passing arr as an argument.
     * @return return arr as array.
     * @TimeComplexity: O(N)
     * @SpaceComplexity: O(N)
     */
    public static int[] findNSEToRightApproach2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                int index = stack.pop();
                arr[index] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            int index = stack.pop();
            arr[index] = -1;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        // int[] result = findNSEToRight(arr);
        // int[] result = findNSEToRightApproach1(arr);
        int[] result = findNSEToRightApproach2(arr);
        printArray(result);
    }
}
