package array;

import java.util.Scanner;

public class BarChart {

    /**
     * This method calculate maximum height of bar:
     * @param arr passing arr as an argument.
     * @return return max bar height.
     * @TimeComplexity: O(N) where N is array length.
     * @SpaceComplexity: O(1)
     */

    private static int maxBarHeight (int arr[]) {
        int maxBar = Integer.MIN_VALUE;
        for (int bar : arr) {
            maxBar = (maxBar < bar) ? bar : maxBar;
        }
        return maxBar;
    }

    /**
     * This method will print the Bar:
     * @param arr passing arr as an argument.
     * @param maxBarHeight passing maxBarHeight as an argument.
     * @TimeComplexity: O(m*n) where m is maxBarHeight, and n is length array.
     * @SpaceComplexity: O(n)
     */
    private static void printBar (int[] arr, int maxBarHeight) {
        for (int i = maxBarHeight; i > 0; i--) {

            for (int data : arr) {
                boolean isStar = (i <= data);
                System.out.print(isStar ? "* " : "- ");
            }
            System.out.println();


        }
    }

    /**
     * This method will print the Bar:
     * @Param arr – passing arr as an argument. maxBarHeight – passing maxBarHeight as an argument.
     * @TimeComplexity: O(m*n) where m is maxBarHeight, and n is length array.
     * @SpaceComplexity: O(n)
     */
    private static void printBarChart (int[] arr) {
        int maxBarHeight = maxBarHeight(arr);
        printBar(arr, maxBarHeight);
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        printBarChart(arr);
    }
}
