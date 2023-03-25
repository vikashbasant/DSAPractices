package array;

import java.util.Scanner;

public class FirstAndLastIndexArray {


    /**
     * This method find the first index of the array:
     * @param arr passing arr as an argument.
     * @param data passing data as an argument.
     * @return return first index, if found otherwise return -1:
     * @TimeComplexity: The time complexity of the given code is O(log n), where n is the size of the input array.
     * This is because the code uses the binary search algorithm to find the first index of the given element in the
     * sorted array. The binary search algorithm divides the input array into two halves at each iteration and
     * eliminates one half of the array in each iteration, resulting in a time complexity of O(log n).
     *
     * @SpaceComplexity: The space complexity of the code is O(1), which is constant space complexity, as the code
     * uses a constant amount of extra space to store the variables i, j, mid, and firstIndex, regardless of the size
     * of the input array.
     */
    private static int firstIndex (int[] arr, int data) {
        int firstIndex = -1;

        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;

            if (arr[mid] == data) {
                firstIndex = mid;
                j = mid - 1;
            } else if (arr[mid] > data) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return firstIndex;
    }


    /**
     * This method find the last index of the array:
     * @param arr passing arr as an argument.
     * @param data passing data as an argument.
     * @return return first index, if found otherwise return -1:
     * @TimeComplexity: The time complexity of the given code is O(log n), where n is the size of the input array.
     * This is because the code uses the binary search algorithm to find the last index of the given element in the
     * sorted array. The binary search algorithm divides the input array into two halves at each iteration and
     * eliminates one half of the array in each iteration, resulting in a time complexity of O(log n).
     *
     * @SpaceComplexity: The space complexity of the code is O(1), which is constant space complexity, as the code
     * uses a constant amount of extra space to store the variables i, j, mid, and lastIndex, regardless of the size
     * of the input array.
     */
    private static int lastIndex (int[] arr, int data) {
        int lastIndex = -1;

        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;

            if (arr[mid] == data) {
                lastIndex = mid;
                i = mid + 1;
            } else if (arr[mid] > data) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return lastIndex;
    }


    /**
     * This method are used to print First and Last index of data in the given array.
     * @param arr passing arr as an argument.
     * @param data passing data as an argument.
     * @TimeComplexity: The time complexity of the provided code is O(log n) because it uses binary search algorithm
     * in both firstIndex and lastIndex functions. The time complexity of binary search is logarithmic because the
     * search space is halved in each iteration.
     *
     * @SpaceComplexity: The space complexity of the provided code is O(1), which is constant, because it uses a fixed
     * amount of memory regardless of the size of the input array. The variables used are all of constant size and do
     * not depend on the input size.
     */
    private static void printFirstAndLastIndexOfElement (int[] arr, int data) {
        int firstIndex = firstIndex(arr, data);
        int lastIndex = lastIndex(arr, data);
        System.out.println("FirstIndex = " + firstIndex + " LastIndex = " + lastIndex);
    }

    public static void main (String[] ars) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int data = scan.nextInt();

        printFirstAndLastIndexOfElement(arr, data);
    }
}
