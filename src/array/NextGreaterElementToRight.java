package array;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementToRight {

    public static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    /**
     * Print the all greater element to right:
     * @param arr passing arr as an arguement.
     * @TimeComplexity The time complexity of the code is O(n^2), where n is the length of the input array arr.
     * This is because there are two nested loops that each iterate over the entire array.
     *
     * The outer loop iterates n times, and for each iteration, 
     * the inner loop iterates n-i-1 times (where i is the current iteration of the outer loop). 
     * Therefore, the total number of iterations of the inner loop is the sum of the integers from 1 to n-1, 
     * which is equal to (n-1)n/2. This gives us a time complexity of O(n*(n-1)/2) = O(n^2).
     *
     * @SpaceComplexity The space complexity of the code is O(1), since it uses a constant amount of additional memory,
     * regardless of the size of the input array.
     */
    public static void findNextGreaterElementToRight(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = arr[j];
                    break;
                }
            }
            arr[i] = max;
        }
    }

    /**
     * Find the greater element to right:
     * @param arr passing arr as an argument.
     *
     * @TimeComplexity: The time complexity of the code is O(n), where n is the length of the input array arr. This is because the code uses a stack to keep track of elements, and each element is pushed and popped from the stack exactly once. Therefore, the time complexity of the code is proportional to the size of the input array.
     *
     * @SpaceComplexity: The space complexity of the code is O(n), since the stack can potentially hold all the elements of the input array. In the worst case, when the input array is in decreasing order, the stack will hold all n elements of the array. However, in the average case, the size of the stack will be much smaller than n.
     *
     */
    public static void findNextGreaterElementToRightUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = arr.length - 1; i >= 0; i--) {

            int data = arr[i];

            // Top Element of stack is smaller data then simply pop() them:
            while (!stack.isEmpty() && (stack.peek() < data)) {
                stack.pop();
            }

            // After poping the element, If stack isEmpty() that mean right side no element greater than data i.e -1:
            if (stack.isEmpty()) {
                arr[i] = -1;
            } else if(stack.peek() > data) {
                // If stack peek() element is greater then data, i.e next greater element to right is stack.peek() only.
                arr[i] = stack.peek();
            }
            stack.push(data);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // findNextGreaterElementToRight(arr);
        findNextGreaterElementToRightUsingStack(arr);
        printArray(arr);
    }
}
