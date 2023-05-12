package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateOccurrenceOfCharacter {

    /**
     * Iterate Over a map to find the duplicate character:
     * @param map passing map as an argument
     * @timeComplexity O(n)
     * @SpaceComplexity O(1)
     */
    public static void helperPrintDuplicateCharacter(Map<Character, Integer> map) {
        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + ": " + map.get(key));
            }
        }

    }

    /**
     * print the duplicate character from the string
     * @param str passing str as an argument
     * @timeComplexity O(n)
     * @spaceComplexity O(n)
     */
    public static void printDuplicateOccurrenceOfCharacter(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        helperPrintDuplicateCharacter(map);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        printDuplicateOccurrenceOfCharacter(str);
    }
}
