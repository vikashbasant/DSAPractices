package flowcontrol.foreachloop;

import java.util.Scanner;

public class ExForEachLoop {

    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        printArray(arr);
    }
}
