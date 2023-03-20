package array.implication;

/**
 * Third Implication based on Function Implication:
 */
public class FunctionImplication {
    private static void swap (int[] arr, int ele1, int ele2) {
        // Here swap function will receive array, Here array is shallow copy not deep copy:
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }

    private static void printArray (int[] arr) {
        // Here printArray function will receive array, Here array is shallow copy not deep copy:
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main (String[] args) {
        int[] arr = new int[5];
        arr[0] = 87;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 45;
        arr[4] = 65;

        // swap an array:
        swap(arr, 0, 4);

        // print Array:
        printArray(arr);
    }
}
