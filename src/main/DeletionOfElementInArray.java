package main;

public class DeletionOfElementInArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " contains " + arr[i]);
        }
    }


    public static void printArray(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains " + arr[i]);
        }
    }

    public static int deletionLastElement(int[] arr, int length) {
        arr[length--] = 0;
        return length;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        int length = 0;

        for (int i = 0; i < 6; i++) {
            arr[length++] = i;
        }

        System.out.println("length: " + length);

//        printArray(arr);

        printArray(arr, length);

        int updatedLength = deletionLastElement(arr, length-1);

        printArray(arr, updatedLength);

                printArray(arr);
    }
}
