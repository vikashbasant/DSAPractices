package fileiopackage.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * In this program, overriding of existing data
 */
public class FileWriterDemo {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("abc.txt")) {

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
