package regularexpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program to extract emailId present in input txt
 * file where email id are mixed with normal text data.
 */
public class ExtractValidMailIdFromInputEmailFileToOutputEmailFile {

    public static final String INPUT_FILE = "src/regularexpression/inputoutput/InputEmail.txt";
    public static final String OUTPUT_FILE = "src/regularexpression/inputoutput/OutputEmail.txt";

    public static void main(String[] args) throws IOException {

        // Where we need to write the mobile number:
        // From where we need to read the data:
        try (
                PrintWriter pw = new PrintWriter(OUTPUT_FILE);
                BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE))
        ) {

            // Create a regular expression to match the MailId:
            String email = "[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+(([.][a-zA-Z]+)+)";

            // Create a Pattern object to match the mobile number:
            Pattern p = Pattern.compile(email);


            // We need to read the data line by line:
            String line = br.readLine();

            // We need to match the mobile number in the line:
            while (line != null) {
                // Create a Matcher object to match the email id:
                Matcher m = p.matcher(line);

                // Check if the given email is valid or not:
                while (m.find()) {
                    // Write the email id to the Output file:
                    pw.println(m.group());
                }
                line = br.readLine();
            }
            pw.flush();
        }

    }
}
