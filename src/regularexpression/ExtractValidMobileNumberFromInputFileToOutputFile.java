package regularexpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program to extract mobile numbers present in input txt
 * file where mobile number are mixed with normal text data.
 */
public class ExtractValidMobileNumberFromInputFileToOutputFile {

    public static final String OUTPUT_FILE = "src/regularexpression/inputoutput/Output.txt";
    public static final String INPUT_FILE = "src/regularexpression/inputoutput/Input.txt";

    public static void main(String[] args) throws IOException {


        // Where we need to write the mobile number:
        // From where we need to read the data:
        try (
                PrintWriter pw = new PrintWriter(OUTPUT_FILE);
                BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE))
        ) {


            // Create a regular expression to match the mobile number:
            // =>> (\\d: means [0-9])
            String pattern = "(0|91)?[6-9]\\d{9}";

            // Create a Pattern object to match the mobile number:
            Pattern p = Pattern.compile(pattern);

            // We need to read the data line by line:
            String line = br.readLine();

            // We need to match the mobile number in the line:
            while (line != null) {

                // Create a Matcher object to match the mobile number:
                Matcher m = p.matcher(line);

                // Check if the given mobile number is valid or not:
                while (m.find()) {

                    // Write the mobile number to the Output file:
                    pw.println(m.group());

                }

                // move to the next line:
                line = br.readLine();

            }
            pw.flush();

        }

    }
}
