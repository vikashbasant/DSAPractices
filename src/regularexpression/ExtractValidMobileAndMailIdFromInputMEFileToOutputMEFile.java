package regularexpression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program to extract email Id present in input txt
 * file where email id are mixed with normal text data.
 */
public class ExtractValidMobileAndMailIdFromInputMEFileToOutputMEFile {
    public static void main(String[] args) throws IOException {

        // Create a regular expression to match the MailId and MobileNo:
        String MobileAndEmail = "(0|91)?[6-9][0-9]{9} | [a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+(([.][a-zA-Z]+)+)";

        // Create a Pattern object to match the mobile number and EmailId:
        Pattern p = Pattern.compile(MobileAndEmail);

        // Where we need to write the mobile number and EmailId:
        PrintWriter pw = new PrintWriter("OutputME.txt");

        // From where we need to read the data:
        BufferedReader br = new BufferedReader(new FileReader("./InputME.txt"));

        // We need to read the data line by line:
        String line = br.readLine();

        // We need to match the mobile number and EmailId in the line:
        while (line != null) {
            // Create a Matcher object to match the mobile number and EmailId:
            Matcher m = p.matcher(line);

            // Check if the given mobile number and EmailId is valid or not:
            while (m.find()) {
                // Write the mobile number and EmailId  to the Output file:
                pw.println(m.group());
            }
            line = br.readLine();
        }
        pw.flush();
        pw.close();
        br.close();
    }
}
