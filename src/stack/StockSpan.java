package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(data -> System.out.print(data + " "));
    }

    /**
     * Find the Stock Span: ( It is similar as find next greater element on left)
     * @param price passing price as an argument.
     * @param n passing n as an argument.
     * @return return stock span result as an array.
     * @timeComplexity O(n)
     * @spaceComplexity O(n)
     */
    public static int[] calculateSpan(int[] price, int n)
    {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++) {
            while(!stack.isEmpty() && price[i] >= price[stack.peek()]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result[i] = i + 1;
            }else if(price[i] < price[stack.peek()]) {
                result[i] = i - stack.peek();
            }
            stack.push(i);

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scan.nextInt();
        }

        int[] result = calculateSpan(prices,n);
        printArray(result);
    }
}
