package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateOccurrenceOfString {

    /**
     * Iterate Over a map to find the duplicate String from sentence:
     * @param map passing map as an argument
     * @timeComplexity O(n)
     * @spaceComplexity O(1)
     */
    public static void helperPrintDuplicateString(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + ": " + map.get(key));
            }
        }

    }

    /**
     * print the duplicate occurrence of String from the sentence:
     * @param str passing str as an argument
     * @timeComplexity O(n)
     * @spaceComplexity O(1)
     */
    public static void printDuplicateOccurrenceOfString(String str) {
        String[] strArray = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String data : strArray) {
            map.put(data, map.getOrDefault(data, 0) + 1);
        }

        helperPrintDuplicateString(map);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        printDuplicateOccurrenceOfString(str);
    }
}
