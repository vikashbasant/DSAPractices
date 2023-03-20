package array.implication;

/**
 * Second Implication bested on Assignment:
 */

public class AssignmentImplication {

    private static void printArray(int[] array ) {
        for (int ele : array) {
            System.out.println(ele+ " ");
        }
    }
    public static void main (String[] args) {

        // array declaration and assignment at one place:
        int[] one = new int[3];
        one[0] = 10;
        one[1] = 20;
        one[2] = 30;

        // print Array:
        printArray(one);

        int[] two = one; // Here this means shallow copy, not deep copy:

        two[0] = 200;

        // print Array:
        printArray(two);

        // print Array:
        printArray(one);
    }
}
