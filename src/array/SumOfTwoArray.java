package array;


import java.util.Scanner;


public class SumOfTwoArray {


    /**
     * sumBetter Method add two array:
     * @param arr1 passing arr1 as an argument.
     * @param arr2 passing arr2 as an argument.
     * @TimeComplexity: O(N) where N is length of array.
     * @SpaceComplexity: O(N) Where N is length of Array.
     */

    private static void sumBetter (int[] arr1, int[] arr2) {

        int sArr1 = arr1.length;
        int sArr2 = arr2.length;

        int[] total = new int[Math.max(sArr1, sArr2)];

        int i = sArr1-1;
        int j = sArr2-1;
        int k = total.length-1;

        int carry = 0;

        while (k >= 0) {

            int digit = carry;

            if (i >= 0) {
                digit += arr1[i];
            }

            if (j >= 0) {
                digit += arr2[j];
            }

            carry = digit/10;
            digit %= 10;


            total[k] = digit;

            i--;
            j--;
            k--;

        }

        if (carry != 0) {
            System.out.print(carry);
        }

        for (int data : total) {
            System.out.print(data);
        }
    }

    /**
     * sum Method add two array:
     * @param arr1 passing arr1 as an argument.
     * @param arr2 passing arr2 as an argument.
     * @TimeComplexity: O(N) where N is length of array.
     * @SpaceComplexity: O(N) Where N is length of Array.
     */
    private static void sum (int[] arr1, int[] arr2) {

        int sizeOfArr1 = arr1.length;
        int sizeOfArr2 = arr2.length;

        int[] sum = new int[Math.max(sizeOfArr1, sizeOfArr2)];

        int i = sizeOfArr1-1;
        int j = sizeOfArr2-1;
        int k = (sum.length)-1;

        int carry = 0;

        while (i >= 0 && j >= 0) {

            int digitSum = arr1[i--] + arr2[j--] + carry;
            sum[k--] = digitSum%10;
            carry = digitSum/10;

        }

        while (i >= 0) {

            int digitSum = arr1[i--] + carry;
            sum[k--] = digitSum%10;
            carry = digitSum/10;

        }

        while (j >= 0) {

            int digitSum = arr2[j--] + carry;
            sum[k--] = digitSum%10;
            carry = digitSum/10;

        }

        if (carry != 0) {
            System.out.print(carry);
        }

        for (int data : sum) {
            System.out.print(data);
        }

    }
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sizeOfArr1 = scanner.nextInt();
        int[] arr1 = new int[sizeOfArr1];
        for (int i = 0; i < sizeOfArr1; i++) {
            arr1[i] = scanner.nextInt();
        }

        int sizeOfArr2 = scanner.nextInt();
        int[] arr2 = new int[sizeOfArr2];
        for (int i = 0; i < sizeOfArr2; i++) {
            arr2[i] = scanner.nextInt();
        }

        sumBetter(arr1, arr2);

    }
}
