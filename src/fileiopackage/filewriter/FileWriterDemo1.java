package fileiopackage.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * In this program append data into file at last line.
 */
public class FileWriterDemo1 {
    public static void main(String[] args) {

        // Every time text will we add to the last line of the file: due to append: true
        try (FileWriter fw = new FileWriter("abcAppend.txt", true)) {

            fw.write(100); // adding a single character => (100 == 'd')

            fw.write("urga\nSoftwareSolutions"); // adding String
            fw.write("\n");

            char[] ch = {'a', 'b', 'c'}; // adding a character array:
            fw.write(ch);
            fw.write("\n");

            fw.flush();
            // fw.close(); // It is redundant because here we are using try-with-resource.
            // So it is automatically the close the connection.

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
