package test;

import java.util.*;

public class InterSectionOfArray {

    public static List<Integer> interSection(int[] a, int[] b) {

        // InterSection between two array results are store into commonData:
        List<Integer> commonData = new ArrayList<>();

        // For Intermediate operation we need used the hashmap:
        Map<Integer, Integer> map = new HashMap<>();
        for (int data : a) {
            map.put(data, map.getOrDefault(data, 0) + 1);
        }

        // performing operation Logic:
        for (int data : b) {
            if (map.containsKey(data) && (map.get(data) > 0)) {
                commonData.add(data);
                map.put(data, map.get(data) - 1);

            }
        }

        return commonData;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();

        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = scan.nextInt();
        }

        int n = scan.nextInt();

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scan.nextInt();
        }

        List<Integer> list = interSection(arr1, arr2);
        for (Integer data : list) {
            System.out.print(data + " ");
        }

    }
}
