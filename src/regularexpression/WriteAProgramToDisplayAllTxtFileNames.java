package regularexpression;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a program to display all .txt file names present in src/regularexpression/inputoutput folder
 */

public class WriteAProgramToDisplayAllTxtFileNames {

    public static final String FILE_NAME = "src/regularexpression/inputoutput";

    public static void main(String[] args) {

        // This is a regular expression/pattern which is used to match the given string:
        String pattern = "[a-zA-Z0-9._$]+[.]txt";

        // We are searching for the pattern in the text
        // We are using the Pattern class to create a pattern object
        Pattern p = Pattern.compile(pattern);

        // Create an object File Class:
        File file = new File(FILE_NAME);

        // Fetch all file names and directories names:
        String[] list = file.list();

        // if the file is not empty:
        assert list != null;
        int count = 0;
        for (String s : list) {

            // We are using the Pattern class matcher() method, to create a matcher object, and return Matcher Object:
            Matcher m = p.matcher(s);

            if (m.find() && (m.group().equals(s))) {
                count++;
                System.out.println(s);
            }
        }
        System.out.println("Total .txt file present: " + count);
    }
}
