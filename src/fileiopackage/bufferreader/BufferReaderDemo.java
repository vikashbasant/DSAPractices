package fileiopackage.bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

    public static final String FILE_NAME = "circket.txt";
    public static void main(String[] args) {

        try (
                FileReader fileReader = new FileReader(FILE_NAME);
                BufferedReader br = new BufferedReader(fileReader)) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            // br.close(); // It is redundant because here we are using try-with-resource.
            // So it is automatically close the connection.

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
