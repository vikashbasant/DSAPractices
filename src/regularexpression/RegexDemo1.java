package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * If we call a method with class name and that method returns a value of the same class,
 * then that method is known as Static Factory Method.
 * <p/>
 * How we can create a Pattern object: using Pattern.compile() method.
 * .compile() method is a static method which presents in the Pattern class.
 * <p/>
 * How we can create a Matcher Object: using (Parent Class Object).matcher().
 * .matcher() method is an instance method which presents in the Pattern class.
 */

public class RegexDemo1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // This is a regular expression/pattern which is used to match the given string:
        System.out.println("Enter a regular expression/pattern:");
        String pattern = scan.next();

        scan.nextLine();

        // Where do we have to search the pattern:
        System.out.println("Enter the string to search:");
        String targetString = scan.nextLine();

        // We are searching for the pattern in the text
        // We are using the Pattern class to create a pattern object
        Pattern p = Pattern.compile(pattern);

        // We are using the Pattern class matcher() method, to create a matcher object, and return Matcher Object:
        Matcher m = p.matcher(targetString);

        int count = 0;

        while (m.find()) {
            count++;
            System.out.println(m.start() + " " + m.end() + " " + m.group());
        }
        System.out.println("The total number of occurrences of \"" + pattern + "\" is : " + count);
    }
}
