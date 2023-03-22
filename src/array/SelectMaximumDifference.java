package array;

import java.util.Scanner;

/**
 * Given an array A of N integers, for each i your task is to find min(A[0],A[1],,A[I-1])-min (A[I-1],A[i+2], A[n-1]). If there are no element at the left or right of i then consider minimum element towards that part to be zero.
 */
public class SelectMaximumDifference {

    public static int[] findDifferenceArrayBetter (int n, int a[]) {

        // Calculate suffix min array:
        int[] suffix = new int[n];
        int rightMin = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            rightMin = Math.min(rightMin, a[i]);
            suffix[i] = rightMin;
        }

        // For Result:
        int[] result = new int[n];

        int leftMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[i] = (0 - suffix[i+1]);
            } else if (i == n - 1) {
                result[i] = (leftMin);
            } else {
                result[i] = (leftMin - suffix[i+1]);
            }

            leftMin = Math.min(leftMin, a[i]);
        }
        return result;
    }

    public static int[] findDifferenceArray(int N, int A[]) {

        // Calculate prefix min array:
        int[] prefix = new int[N];
        int leftMin = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            leftMin = Math.min(leftMin, A[i]);
            prefix[i] = leftMin;
        }

        // Calculate postfix min array:
        int[] postfix = new int[N];
        int rightMin = Integer.MAX_VALUE;
        for (int i = N - 1; i >= 0; i--) {
            rightMin = Math.min(rightMin, A[i]);
            postfix[i] = rightMin;
        }

        // For Result:
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            // boundary condition:
            int left = (i == 0) ? 0 : prefix[i-1];
            int right = (i == N-1) ? 0 : postfix[i+1];
            result[i] = left - right;
        }

        return result;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int[] differenceArray = findDifferenceArrayBetter(n, arr);
        for (int data : differenceArray) {
            System.out.print(data+" ");
        }

    }
}
