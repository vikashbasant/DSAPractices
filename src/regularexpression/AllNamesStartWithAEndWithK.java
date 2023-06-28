package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllNamesStartWithAEndWithK {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // This is a regular expression/pattern which is used to match the given string:
        String pattern = "[aA][a-zA-Z]*[kK]";
        System.out.println("A regular expression/pattern: " + pattern);


        // Where do we have to search the pattern:
        System.out.println("Enter the Name: ");
        String targetString = scan.nextLine();

        // We are searching for the pattern in the text
        // We are using the Pattern class to create a pattern object
        Pattern p = Pattern.compile(pattern);

        // We are using the Pattern class matcher() method, to create a matcher object, and return Matcher Object:
        Matcher m = p.matcher(targetString);

        if (m.find() && (m.group().equals(targetString))) {
            System.out.println("Yes, Name " + targetString + " start with 'a||A' and end with 'k||K'");
        } else {
            System.out.println("No, Name " + targetString + " not start with 'a||A' and end with 'k||K'");
        }

    }
}
