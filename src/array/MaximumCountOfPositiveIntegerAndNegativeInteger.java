package array;

import java.util.Scanner;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {

    private static int negativePositions (int[] arr) {
        int i = 0;
        int j = arr.length-1;

        // initialize nPos with -1, assume that last Position of negative number -1:
        int nPos = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] < 0) {
                nPos = mid;
                i=mid+1;
            }else{
                j = mid-1;
            }
        }
        return nPos;
    }


    private static int positivePositions (int[] arr) {
        int i = 0;
        int j = arr.length-1;

        // initialize pPos with arr.length, assume that first position of positive number arr.length:
        int pPos = arr.length;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] > 0) {
                pPos = mid;
                j=mid-1;
            }else{
                i = mid+1;
            }
        }
        return pPos;
    }



    private static int maximumCount(int[] nums) {

        int pPos = positivePositions(nums);
        System.out.println(pPos);
        int nPos = negativePositions(nums);
        System.out.println(nPos);
        return Math.max(nPos+1, (nums.length - pPos));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int result = maximumCount(arr);
        System.out.println(result);

    }
}
