package main;

import java.util.ArrayList;
import java.util.List;

public class SplitString {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> result = new ArrayList<>();

        String s1 = "\\" + separator;
        for (String word : words) {
            String[] splitString = word.split(s1);

            for (String s : splitString) {
                if (!s.isEmpty()) {
                    result.add(s);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("one.two.three");
        words.add("four.five");
        words.add("six");

        char separator = '.';
        List<String> result = splitWordsBySeparator(words, separator);
        for (String word : result) {
            System.out.print(word + " ");
        }
    }
}
