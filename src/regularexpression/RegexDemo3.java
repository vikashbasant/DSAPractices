package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Predefined character classes:
 * <p/>
 * \s---------------------space character
 * <p/>
 * \d---------------------Any digit from o to 9[o-9]
 * <p/>
 * \w---------------------Any word character(alphaNumeric)[a-zA-Z0-9]
 * <p/>
 * . ---------------------Any character including special characters.
 * <p/>
 * \S---------------------any character except space character
 * <p/>
 * \D---------------------any character except digit
 * <p/>
 * \W---------------------any character except word character(special character)
 * <p/>
 */
public class RegexDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // This is a regular expression/pattern which is used to match the given string:
        System.out.println("Enter a regular expression/pattern:");
        String pattern = scan.next();


        // Where do we have to search the pattern:
        String targetString = "a1b 7@z#";

        // We are searching for the pattern in the targetString:
        Pattern p = Pattern.compile(pattern);

        // We are using the Pattern class to create a matcher object:
        Matcher m = p.matcher(targetString);

        while (m.find()) {
            System.out.println(m.start() + " === " + m.group());
        }
    }
}


