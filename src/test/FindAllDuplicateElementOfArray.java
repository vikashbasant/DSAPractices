package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllDuplicateElementOfArray {

    /**
     * Find the all duplicate elements from the array:
     *
     * @param arr Passing arr as an argument.
     * @return return list of ArrayList.
     * @TimeComplexity O(N)
     * @SpaceComplexity O(1)
     */
    public static List<Integer> findAllDuplicate(int[] arr) {
        List<Integer> allDuplicate = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            // that means Math.abs(arr[i]-1) already present in the array:
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                // If element is already visited, then it is one possible solution:
                allDuplicate.add(Math.abs(arr[i]));
            } else {
                // visited marked element:
                arr[index] = -arr[index];
            }
        }

        return allDuplicate;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        List<Integer> result = findAllDuplicate(arr);
        System.out.println(result);
    }
}
