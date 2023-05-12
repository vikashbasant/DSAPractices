package fileiopackage.somequestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Write a program to perform File merge(combine) operation
 */
public class FileIODemo {
    
    public static final String FILE_NAME_1 = "src/fileiopackage/somequestion/file1.txt";
    public static final String FILE_NAME_2 = "src/fileiopackage/somequestion/file2.txt";
    public static final String FILE_NAME_3 = "src/fileiopackage/somequestion/file3.txt";

    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter(FILE_NAME_3)) {

            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME_1));
            String line = br.readLine();
            while (line != null) {
                pw.println(line);;
                line = br.readLine();
            }

            br = new BufferedReader(new FileReader(FILE_NAME_2));
            line = br.readLine();
            while (line != null) {
                pw.println(line);
                line = br.readLine();
            }

            pw.flush();
            br.close();
            pw.close();


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
