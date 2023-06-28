package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In Regular Expression cursor can move 1 extra index: To check this a* and a? Check the last index.
 * <p/>
 * We can use to specify number of occurrences to match:
 * <p/>
 * Quantifiers means how many times occurrences of characters in target string:
 * <p/>
 * Quantifiers can be used to specify no of characters to match.
 * <p/>
 * a-----------------------Exactly one 'a'
 * <p/>
 * a+----------------------At least one 'a' ('+' symbol means quantifiers)
 * <p/>
 * a*----------------------Any no of a's including zero number [a* = a+ U {ϵ}]
 * <p/>
 * a? ----------------------At most one 'a' including zero number
 * <p/>
 */

public class RegexDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // This is a regular expression/pattern which is used to match the given string:
        System.out.println("Enter a regular expression/pattern:");
        String pattern = scan.next();

        // Where do we have to search the pattern:
        String targetString = "abaabaaab";

        // We are searching for the pattern in the text
        // We are using the Pattern class to create a pattern object
        Pattern p = Pattern.compile(pattern);

        // We are using the Pattern class to create a matcher object
        Matcher m = p.matcher(targetString);

        while (m.find()) {
            System.out.println(m.start() + " === " + m.group());
        }
    }
}
