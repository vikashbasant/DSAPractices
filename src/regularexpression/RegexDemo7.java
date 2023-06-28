package regularexpression;

import java.util.Scanner;

/**
 * Note: String class split() method can take regular expression as argument, whereas
 * <p/>
 * pattern class split() method can take target string as the argument.
 * <p/>
 * String class contains split() method to split the given string which takes regular expression as arguments.
 * <p/>
 * \\.(for dot), [.](for dot)
 * <p/>
 * \\s (for space)
 * <p/>
 */
public class RegexDemo7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // This is a regular expression/pattern which is used to match the given string:
        System.out.println("Enter a regular expression/pattern:");
        String pattern = scan.next();

        scan.nextLine();

        // Where do we have to search the pattern:
        System.out.println("Enter the string to search:");
        String targetString = scan.nextLine();

        // split the string using space as delimiter:
        String[] words = targetString.split(pattern);

        for (String word : words) {
            System.out.println(word);
        }


    }
}
