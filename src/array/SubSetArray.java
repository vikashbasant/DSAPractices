package array;

import java.util.Scanner;

public class SubSetArray {

    /**
     * This method are used to printSubSet:
     * @param arr passing arr as an argument.
     * @TimeCompolexity: The time complexity of the code is O(n * 2^n) and the space complexity is O(1),
     *  where n is the length of the input array arr. The outer loop runs for 2^n iterations, as each subset of arr
     *  is represented by a binary number of length n, and there are 2^n such binary numbers. For each iteration of
     *  the outer loop, the inner loop runs n times to generate the binary representation of the current subset.
     *  Therefore, the overall time complexity is O(n * 2^n).
     *
     * @SpaceComplexity: The space complexity is O(1) because the amount of memory used by the code does not depend on
     *  the size of the input array. The only variables that are stored in memory are limit, temp, str, i, j, and rem,
     *  all of which require a constant amount of memory.
     */
    private static void printSubSet(int[] arr) {

        // limit number of time outer loop will iterate. which means outer loop iterate O(2^n) times.
        int limit = (int) Math.pow(2,arr.length);

        for (int i = 0; i < limit; i++) {

            // Here we can use temp internally.
            int temp = i;

            // str string are used to crate a result
            String str = "";

            // Inner loop iterate over length of array.
            for (int j = arr.length - 1; j >= 0; j--) {

                // Find the remainder of number temp:
                int rem = temp%2;

                // Find the quotient of number temp:
                temp /= 2;

                // If rem is equal to that means ignore that number instead put "- "
                if (rem == 0) {
                    str = "- " + str;
                }else{
                    // otherwise put that number into string str:
                    str = arr[j] + " " + str;
                }
            }
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        printSubSet(arr);
    }
}
