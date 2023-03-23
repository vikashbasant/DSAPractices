package array;

import java.util.Scanner;

public class FindElementInArray {

    /**
     * If element is present in the array, then return index of element otherwise return -1.
     * This function will return only first occurrence of element in the array.
     * If element is present at multiple index you want last index then show don't break the loop after first occurrences.
     * @TimeComplexity: O(N) where N is the length of the array.
     * @SpaceComplexity: O(1)
     * @param arr passing arr as an argument.
     * @param element passing element as an argument.
     * @return return index.
     */

    private static int isElementPresent (int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int data = scan.nextInt();

        int result = isElementPresent(arr, data);
        System.out.println(data + " is present at index = " + result);

    }
}
