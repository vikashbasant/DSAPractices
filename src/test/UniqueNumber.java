package test;

import java.util.Scanner;

public class UniqueNumber {

    public static int findUniqueNo(int[] arr) {
        int ans = 0;
        for (int ele : arr) {
            ans ^= ele;
        }
        return ans;
    }

    public static void printArray(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

//        printArray(arr);
        if (n % 2 != 0) {
            int result = findUniqueNo(arr);
            System.out.println(result);
        }

    }
}
