package flowcontrol.foreachloop;

import java.util.Scanner;

public class ExForEachLoop1 {

    private static void printArray(int[][] arr) {
        for (int[] iArr : arr) {
            for (int element : iArr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] arr = new int[size][];

        for (int i = 0; i < size; i++) {
            // create an internal array:
            int iSize = scan.nextInt();
            int[] iArr = new int[iSize];
            for (int j = 0; j < iSize; j++) {
                iArr[j] = scan.nextInt();
            }

            // put 1'D array into 2'D array:
            arr[i] = iArr;
        }

        printArray(arr);
    }
}
