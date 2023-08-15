package hackerrank;

import java.util.Scanner;

public class Sort01 {

    public static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    public static void sortArray01(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while (j <= k) {
            if (arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[j] == 1) {
                j++;
            } else if (arr[j] == 2) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        sortArray01(arr);
        printArray(arr);
    }
}
