package test;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberInArray {

    //  TimeComplexity: O(n^2)
    //  SpaceComplexity: O(1)
    public static int findMissingNo1(int[] arr) {
        int missingNo = -1;
        for (int i = 0; i <= arr.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    isPresent = true;
                    break;
                }
            }

            if (!isPresent) {
                missingNo = i;
                break;
            }
        }
        return missingNo;
    }

    // TimeComplexity: O(nlogn)
    // SpaceComplexity: O(1)
    public static int findMissingNo2(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length; i++) {
            if (i >= arr.length || i != arr[i]) {
                return i;
            }
        }
        return -1;
    }

    // TimeComplexity: O(n)
    // SpaceComplexity: O(1)
    public static int findMissingNoBetter(int[] arr) {

        int arrayXOR = 0;
        for (int data : arr) {
            arrayXOR ^= data;
        }

        int rangeXOR = 0;
        for (int i = 0; i <= arr.length; i++) {
            rangeXOR ^= i;
        }

        return arrayXOR ^ rangeXOR;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int result = findMissingNoBetter(arr);
        System.out.println(result);

    }
}
