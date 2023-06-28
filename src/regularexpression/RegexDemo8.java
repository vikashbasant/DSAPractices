package regularexpression;

import java.util.StringTokenizer;

/**
 * The default regular expression for the StringTokenizer is space.
 * <p>
 * StringTokenizer:
 * <p>
 * &nbsp;  This class present in java.util package.
 * <p>
 * &nbsp;  It is a specially designed class to perform string tokenization.
 */
public class RegexDemo8 {
    public static void main(String[] args) {
        
        // create an object of string-tokenizer:
        StringTokenizer st = new StringTokenizer("Welcome to our home");

        // traverse over it:
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
