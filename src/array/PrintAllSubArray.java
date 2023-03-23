package array;

import java.util.Scanner;

public class PrintAllSubArray {

    /**
     * This method the array:
     * @param arr passing arr as an argument.
     * @param i passing i as an argument.
     * @param j passing j as an argument.
     * @TimeComplexity: O(N) where N is length of array.
     * @Spaces: The space complexity of the code is O(1), because it only uses a constant amount of additional memory to store the loop index variables and the input array
     */
    private static void printArray (int[] arr, int i, int j) {
        for (int index = i; index <= j; index++) {
            System.out.print(arr[index] + " ");
        }
    }

    /**
     * This method print all the subArray:
     * @param arr passing arr as an argument.
     * @TimeComplexity O(n^3), where n is the length of the input array.
     * @SpaceComplexity The space complexity of the code is O(1), because it only uses a constant amount of additional memory to store the loop index variables and the input array
     */
    private static void printSubArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                printArray(arr, i, j);
                System.out.println();
            }
        }
    }

    /**
     * This method print all the printAllSubArray:
     * @param arr passing arr as an argument.
     * @TimeComplexity: O(n^2), where n is the length of the input array.
     * @SpaceComplexity: O(n), where n is the length of the input array.
     */
    private static void printSubArrayAnother(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i]);
            System.out.println(sb.toString());
            for (int j = i+1; j < arr.length; j++) {
                sb.append(" "+arr[j]);
                System.out.println(sb.toString());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        printSubArrayAnother(arr);
    }
}
