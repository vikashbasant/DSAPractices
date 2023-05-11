package fileiopackage.filereader;

import java.io.FileReader;
import java.io.IOException;

/**
 * In this program FileReader read one character at time:
 */
public class FileReaderDemo {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("abcAppend.txt")) {

            int dataAasicCode = fileReader.read(); // Read more amount of data:

            while (dataAasicCode != -1) {
                System.out.print((char)dataAasicCode);
                dataAasicCode = fileReader.read();
            }

            // fileReader.close(); // It is redundant because here we are using try-with-resource.
            // So it is automatically close the connection.

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
