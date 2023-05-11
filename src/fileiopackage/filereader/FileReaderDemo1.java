package fileiopackage.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * In this program FileReader read one character at time:
 */
public class FileReaderDemo1 {
    public static void main(String[] args) {

        File file = new File("abc.txt");
        char[] chars = new char[(int) file.length()]; // small amount of data:

        try (FileReader fileReader = new FileReader(file)) {

            // This line will return number character are copying into char array:
            fileReader.read(chars);

            for(char ch: chars){
                System.out.print(ch);
            }

            // fileReader.close(); // It is redundant because here we are using try-with-resource.
            // So it is automatically close the connection.

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
