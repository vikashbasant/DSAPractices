package array.implication;

/**
 * First Implication bested on Performance:
 */
public class PerformanceImplication {

    public static void main(String[] args) {
        int[] arr = new int[39];

        arr[38] = 345;
        arr[0] = 1;

        // If you want to access any element from the array, we can get the element with same performance.
        System.out.println(arr[38]);
        System.out.println(arr[0]);
    }
}
