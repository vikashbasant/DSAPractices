package main;

public class DeleteElementFromArray {

    private static void printArray(int[] arr, int val) {
        for (int i = 0; i < val; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int deleteElement(int[] arr, int val) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[len++] = arr[i];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,2,3,4,5};
        int val = 2;
        int result = deleteElement(arr, val);

        printArray(arr, result);
    }
}
