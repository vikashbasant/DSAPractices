package stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementToLeft {

    public static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    /**
     * Find Next Greater Element To Left: (Apply Brute Force Approach)
     * @param arr passing arr as an argument.
     * @return return result of array.
     * @TimeComplexity: O(N^2)
     * @SpaceComplexity: O(N)
     */
    public static int[] findNGEToLeft(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    max = arr[j];
                    break;
                }
            }
            result[i] = max;
        }
        return result;
    }


    /**
     * Find Next Greater Element To Left: ( Using Stack, Traverse array Right to Left)
     * @param arr passing arr as an argument.
     * @return return result of array.
     * @TimeComplexity: O(N)
     * @SpaceComplexity: O(N)
     */
    public static int[] findNGEToLeftApproach1(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
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
     * Find Next Greater Element To Left: (using Stack, a Traverse array from Left to Right)
     * @param arr passing arr as an argument.
     * @return return result of array.
     * @TimeComplexity: O(N)
     * @SpaceComplexity: O(N)
     */
    public static int[] findNGEToLeftApproach2(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                result[i] = -1;
            } else if (arr[i] < stack.peek()) {
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

        // int[] result = findNGEToLeft(arr);
        // int[] result = findNGEToLeftApproach1(arr);
        int[] result = findNGEToLeftApproach2(arr);

        printArray(result);
    }
}
