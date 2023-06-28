package regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Pattern class contains split() method to split the given string against a regular expression.
 * \s(for space)
 */
public class RegexDemo5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // This is a regular expression/pattern which is used to match the given string:
        System.out.println("Enter a regular expression/pattern:");
        String pattern = scan.next();

        // Where do we have to search the pattern:
        String targetString = "Welcome to durgaSoft technologies";

        // We are searching for the pattern in the text
        // We are using the Pattern class to create a pattern object
        Pattern p = Pattern.compile(pattern);

        String[] words = p.split(targetString);
        for (String word : words) {
            System.out.println(word);
        }


    }
}
