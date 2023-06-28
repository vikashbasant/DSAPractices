package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * We need to give the these input:
 * <p/>
 * 1. [abc] =>> Either 'a' or 'b' or 'c'
 * <p/>
 * 2. [^abc] =>> Except 'a' and 'b' and 'c'
 * <p/>
 * 3. [a-z] =>> Any lower case alphabet symbol
 * <p/>
 * 4. [A-Z] =>> Any upper case alphabet symbol
 * <p/>
 * 5. [a-zA-Z] =>> Any alphabet symbol
 * <p/>
 * 6. [0-9] =>> Any digit from 0 to 9
 * <p/>
 * 7. [a-zA-Z0-9] =>> Any alphanumeric character
 * <p/>
 * 8. [^a-zA-Z0-9] =>> Any special character
 */
public class RegexDemo2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // This is a regular expression/pattern which is used to match the given string:
        System.out.println("Enter a regular expression/pattern:");
        String pattern = scan.next();

        scan.nextLine();

        // Where do we have to search the pattern:
        String targetString = "a1b7@z#";

        // We are searching for the pattern in the targetString:
        Pattern p = Pattern.compile(pattern);

        // We are using the Pattern class to create a matcher object
        Matcher m = p.matcher(targetString);

        while (m.find()) {
            System.out.println(m.start() + " === " + m.group());
        }
    }
}



