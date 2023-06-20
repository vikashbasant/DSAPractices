package test;

import java.util.ArrayList;
import java.util.Arrays;

public class InterSectionOfArrayList {

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        // InterSection between two array results are store into commonData:
        ArrayList<Integer> commonData = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1.get(i) == arr2.get(j)) {
                commonData.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(i)) {
                i++;
            } else {
                j++;
            }
        }
        return commonData;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 4, 5));
        int n = 3;
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(3, 4, 5));
        int m = 3;
        ArrayList<Integer> arrayIntersection = findArrayIntersection(arr1, n, arr2, m);
        System.out.println(arrayIntersection);

    }
}
