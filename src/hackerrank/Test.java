package hackerrank;

/*
* String arr[][] = {{"Name","Age"}, 00, 01 -> 00 10
                    {"Alice", "21"}, 10, 11

                    {"Ryan", "30"}}; 20, 21
                    *
                    * 00 01 20
                    * 10 11 21

Name Alice Ryan
Age 21 30
* 12-1
* 10-1
* 6-1 , cout=2
*
* int arr[] = {12, 12, 10, 6, 8, 5, 6, 4, 18};
* [0, 0, 1, 2, 2, 4, 3, 5, 0]
* */


import java.util.HashMap;
import java.util.Map;

public class Test {

    private static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    // {12, 12, 10, 6, 8, 5, 6, 4, 18}
    // 0 1 1 2 2 4 4 5 0
    private static int[] findUniqueGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    Integer orDefault = map.getOrDefault(arr[j], 0);
                    if (orDefault == 0) {
                        count++;
                        map.put(arr[j], 1);
                    }

                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {18, 12, 5, 6, 8, 5, 6, 4, 9};
        int[] result = findUniqueGreaterElement(arr);
        printArray(result);


    }

}