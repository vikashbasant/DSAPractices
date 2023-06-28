package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular Expression For All EmailId: <b>"[a-zA-Z0-9][a-zA-z0-9_.]*@[a-zA-Z]+([.][a-zA-z]+)+"</b>
 * <p/>
 * Regular Expression For GmailId: <b>"[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail.com"</b>
 */
public class ValidateEmailNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Take Email from user:
        System.out.println("Please Give EmailId: ");
        String email = scan.next();

        // Create a regular expression to match the given email:
        String pattern = "[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+(([.][a-zA-Z]+)+)";

        // Create a Pattern object to match the given email:
        Pattern p = Pattern.compile(pattern);

        // Create a Matcher object to match the given email:
        Matcher m = p.matcher(email);

        // Check if the given email is valid or not:
        if (m.find() && (m.group().equals(email))) {
            System.out.println("Valid EmailId: " + email);
        } else {
            System.out.println("Invalid EmailId: " + email);
        }
    }
}
