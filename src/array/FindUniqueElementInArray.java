package array;

import java.util.Scanner;

public class FindUniqueElementInArray {

    /**
     * This method will find the Unique Element from the Array.
     * @param arr passing arr as an argument.
     * @return return the unique element.
     * @TimeComplexity: The time complexity of the provided code is O(n) because it uses a loop to iterate over each
     * element in the input array. Inside the loop, the bitwise XOR operation takes constant time. Therefore, the
     * overall time complexity is proportional to the size of the input array.
     *
     * @SpaceComplexity: The space complexity of the provided code is O(1), which is constant, because it uses a fixed
     * amount of memory regardless of the size of the input array. The only variable used is result, which stores the
     * unique element, and it has a constant size regardless of the input size.
     */
    private static int uniqueElement (int[] arr) {

        int result = 0;

        for (int data : arr) {
            result ^= data;
        }

        return result;
    }
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int uniqueElement = uniqueElement(arr);

        System.out.println("uniqueElement = " + uniqueElement);
    }
}
