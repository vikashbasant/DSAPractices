package fileiopackage.somequestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * write a program to perform file extraction operation.
 */
public class FileIODemo3 {

    public static final String INPUT_FILE = "src/fileiopackage/somequestion/input.txt";
    public static final String OUTPUT_FILE = "src/fileiopackage/somequestion/output.txt";
    public static final String DELETE_FILE = "src/fileiopackage/somequestion/delete.txt";
    public static void main(String[] args) {

        try (
                PrintWriter pw = new PrintWriter(OUTPUT_FILE);
                BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE))
        ) {

            String line = br.readLine();
            while (line != null) {

                boolean available = false;
                BufferedReader br1 = new BufferedReader(new FileReader(DELETE_FILE));
                String line1 = br1.readLine();
                while (line1 != null) {
                    if (line.equals(line1)) {
                        available = true;
                        break;
                    }
                    line1 = br1.readLine();
                }

                if (!available) {
                    pw.println(line);
                }
                line = br.readLine();
            }
            pw.flush();
            br.close();
            br.close();
            pw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
