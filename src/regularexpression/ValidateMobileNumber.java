package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a regular expression to represent all mobile numbers:
 * <p/>
 * &nbsp; Rules:
 * <p/>
 * &nbsp;&nbsp; 1. Should contain exactly 10 digits.
 * <p/>
 * &nbsp;&nbsp; 2. The 1st digits should be 7 to 9.
 * <p/>
 * For (10 || 11) digits Regular Expression: 0?[6-9][0-9]{9}
 * <p/>
 * For (10 || 11 || 12) digits Regular Expression: (0|91)?[6-9][0-9]{9}
 */

public class ValidateMobileNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Take Mobile number form the user:
        System.out.println("Please Give Mobile Number: ");
        String mobileNumber = scan.next();

        // Create a regular expression to match the given mobile number:
        // String pattern = "[6789][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
        // String pattern = "[6-9][0-9]{9}";

        // =>> For 10 digits || 11 digits || 12 digits mobile number Regular Expression:
        String pattern = "(0|91)?[6-9][0-9]{9}";

        // Create a Pattern object to match the given mobile number:
        Pattern p = Pattern.compile(pattern);

        // Create a Matcher object to match the given mobile number:
        Matcher m = p.matcher(mobileNumber);

        // Check if the given mobile number is valid or not:
        if (m.find() && (m.group().equals(mobileNumber))) {
            System.out.println("Valid Mobile Number: " + mobileNumber);
        } else {
            System.out.println("Invalid Mobile Number: " + mobileNumber);
        }

    }
}
