package fileiopackage.somequestion;

import java.io.*;

/**
 * write a program to perform file extraction operation.
 */
public class FileIODemo4 {
    public static final String INPUT_FILE = "src/fileiopackage/somequestion/input1.txt";
    public static final String OUTPUT_FILE = "src/fileiopackage/somequestion/output1.txt";

    public static void main(String[] args) {
        try (
                PrintWriter pw = new PrintWriter(OUTPUT_FILE);
                BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE))
                ) {

            String line = br.readLine();

            while (line != null) {

                boolean available=false;
                BufferedReader br1 = new BufferedReader(new FileReader(OUTPUT_FILE));

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
                    pw.flush();
                }

                line = br.readLine();

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
