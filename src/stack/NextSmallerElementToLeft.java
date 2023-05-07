package stack;

import java.util.Scanner;
import java.util.Stack;

public class NextSmallerElementToLeft {

    public static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    /**
     * Find Next Smaller Element To Left: (Apply Brute Force Approach)
     * @param arr passing as an argument.
     * @return return result as array.
     * @TimeComplexity: O(N^2)
     * @SpaceComplexity: O(N)
     */
    public static int[] findNSEToLeft(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    min = arr[j];
                    break;
                }
            }
            result[i] = min;
        }
        return result;
    }

    /**
     * Find Next Smaller Element To Left: (using Stack, traverse the array from right to left)
     * @param arr passing as an argument.
     * @return return arr as array.
     * @TimeComplexity: O(N)
     * @SpaceComplexity: O(N)
     */
    public static int[] findNSEToLeftApproach1(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                int index = stack.pop();
                arr[index] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int index = stack.pop();
            arr[index] = -1;
        }
        return arr;
    }


    /**
     * Find Next Smaller Element To Left: (using Stack, traverse the array from left to right)
     * @param arr passing as an argument.
     * @return return result as array.
     * @TimeComplexity: O(N)
     * @SpaceComplexity: O(N)
     */
    public static int[] findNSEToLeftApproach2(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // int[] result = findNSEToLeft(arr);
        // int[] result = findNSEToLeftApproach1(arr);
        int[] result = findNSEToLeftApproach2(arr);
        printArray(result);
    }
}
