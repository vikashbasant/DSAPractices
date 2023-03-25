package array;

import java.util.Scanner;

public class BinarySearchAlgo {

    /**
     * This is Binary Search Algorithm:
     * @param arr passing arr as an argument.
     * @param element passing element as an argument.
     * @return return element index, if found otherwise return -1:
     * @TimeComplexity: The time complexity of the given code is O(log n), where n is the size of the input array.
     * This is because the code uses the binary search algorithm to find the index of the given element in the sorted array.
     * The binary search algorithm divides the input array into two halves at each iteration and eliminates one half of the array in each iteration, resulting in a time complexity of O(log n).
     *
     * @SpaceComplexity: The space complexity of the code is O(1), which is constant space complexity, as the code
     * uses a constant amount of extra space to store the variables i, j, mid, and result, regardless of the size of the input array.
     */
    private static int elementSearch (int[] arr, int element) {

    // Calculate the result:
    int result = -1;

    // Here we can use 2-pointer approach:
    int i = 0;
    int j = arr.length - 1;
    while (i <= j) {

        // Calculate the mid:
        int mid = (i + j) / 2;

        // If array of mid is equal to element i.e element is found at mid-index:
        if (arr[mid] == element) {
            result = mid;
            break;
        } else if (arr[mid] < element) {
            // If array of mid is less than element i.e left pointer move forward to right i.e mid+1:
            i = mid + 1;
        } else {
            // Otherwise right pointer move backward to left i.e mid-1:
            j = mid - 1;
        }

    }
    return result;
}


    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int element = scan.nextInt();

        int result = elementSearch(arr, element);
        System.out.println("index = " + result);
    }
}
