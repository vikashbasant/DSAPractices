package array;

import java.util.Scanner;

public class DifferenceOfTwoArray {

    /**
     * Difference between Two Arrays: Where arr2 is always greater than arr1 and digit lies from o to 9
     * @param arr1 passing arr1 as an argument
     * @param arr2 passing arr2 as an argument
     * @TimeComplexity: O(N) Where N is length of the array.
     * @SpaceComplexity: O(N) Where N is length of the array.
     */
    private static void printDifference (int[] arr1, int[] arr2) {

        int[] diff = new int[arr2.length];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        int carry = 0;

        while (k >= 0) {

            int digit = 0;

            int arr1Value = (i >= 0) ? arr1[i] : 0;

            if (arr2[j] + carry >= arr1Value) {

                digit = arr2[j] + carry - arr1Value;
                carry = 0;

            }else {

                digit = arr2[j] + carry + 10 - arr1Value;
                carry = -1;

            }


            diff[k] = digit;

            i--;
            j--;
            k--;
        }

        // We are not printing leading 0: from the diff array:
        int index = 0;
        while (index <= diff.length) {
            if (diff[index] == 0) {
                index++;
            } else {
                break;
            }
        }
        for(int k1 = index; k1 < diff.length; k1++) {
            System.out.print(diff[k1]);
        }
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }

        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i < n2; i++) {
            arr2[i] = scan.nextInt();
        }

        printDifference(arr1, arr2);


    }
}
