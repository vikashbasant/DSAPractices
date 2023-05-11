package fileiopackage.bufferreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo1 {
    public static final String FILE_NAME = "circket.txt";
    public static void main(String[] args) {

        File f = new File(FILE_NAME);

        try (
                FileReader fileReader = new FileReader(f);
                BufferedReader br = new BufferedReader(fileReader)) {

            char[] ch = new char[(int) f.length()];

            br.read(ch);

            for (char data : ch) {
                System.out.print(data);
            }

            // br.close(); // It is redundant because here we are using try-with-resource.
            // So it is automatically close the connection.

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
