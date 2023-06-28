package regularexpression;

import java.util.StringTokenizer;

public class RegexDemo9 {
    public static void main(String[] args) {

        // create an object of string-tokenizer:
        StringTokenizer st = new StringTokenizer("22-01-2022", "-");

        // traverse over it:
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
