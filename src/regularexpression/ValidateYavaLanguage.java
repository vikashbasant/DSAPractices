package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Rule of Java Language:
 * <p/>
 * &nbsp; The allowed characters are:
 * <p/>
 * &nbsp; &nbsp; 1. a to z, A to Z, 0 to 9, $,#
 * <p/>
 * &nbsp; &nbsp; 2. The 1st character should be lower-case alphabet symbol only from a to k.
 * <p/>
 * &nbsp; &nbsp; 3. The second character should be digits which is divisible by 3.
 * <p/>
 * &nbsp; &nbsp; 4. The length of the identifier should be at least 2.
 */

public class ValidateYavaLanguage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // This is a regular expression/pattern which is used to match the given string:
        String pattern = "[a-k][0369][a-zA-Z0-9$#]*";
        System.out.println("A regular expression/pattern: " + pattern);


        // Where do we have to search the pattern:
        System.out.println("Enter the string to search:");
        String targetString = scan.nextLine();

        // We are searching for the pattern in the text
        // We are using the Pattern class to create a pattern object
        Pattern p = Pattern.compile(pattern);

        // We are using the Pattern class to create a matcher object
        Matcher m = p.matcher(targetString);

        if (m.find() && (m.group().equals(targetString))) {
            System.out.println("Valid Identifier: " + targetString);
        } else {
            System.out.println("InValid Identifier: " + targetString);
        }
    }
}
