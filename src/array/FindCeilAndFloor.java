package array;

import java.util.Scanner;

public class FindCeilAndFloor {

    /**
     * This Method will give the Ceil and Floor of the given Data:
     * @param arr passing arr as an argument.
     * @param data passing data as an argument.
     *
     * @TimeComplexity: The time complexity of the given code is O(log n) where 'n' is the length of the input array
     * 'arr'. This is because the code uses binary search algorithm to find the ceil and floor values for a given
     * 'data' value. In each iteration of the while loop, the search space is halved until the element is found or the
     * search space is exhausted. Therefore, the time complexity of binary search algorithm is logarithmic with base 2.
     *
     * @SpaceComplexity: The space complexity of the code is O(1), which is constant space as the algorithm uses only a
     * fixed number of variables to store the intermediate results. Regardless of the input size, the algorithm uses
     * the same amount of memory.
     */
    private static void printCeilAndFloor (int[] arr, int data) {

        // Find the Ceil and Floor Value:
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;

        // Initialized the i and j with start and last index of array:
        int i = 0;
        int j = arr.length-1;

        // While Loop iterate over till find the data otherwise loop will exhausted:
        while (i <= j) {

            // Calculate the mid:
            int mid = (i + j) / 2;

            // If data is found then simply ceil and floor value are same as (arr[mid] or data):
            if (arr[mid] == data) {
                ceil = data;
                floor = data;
                break;
            } else if (arr[mid] > data) {
                // If data is smaller than arr[mid] then search on left side:
                ceil = arr[mid];
                j = mid - 1;
            } else {
                // Otherwise serch data on right side:
                floor = arr[mid];
                i = mid + 1;
            }
        }
        System.out.println("Ceil = " + ceil + " Floor = " + floor);
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int data = scan.nextInt();

        printCeilAndFloor(arr, data);
    }
}
