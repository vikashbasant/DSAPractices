package fileiopackage.somequestion;

import java.io.*;

/**
 * Write a program to perform file merge operation where merging should
 * be performed line by line alternatively.
 */
public class FileIODemo1 {
    public static final String FILE_NAME_1 = "src/fileiopackage/somequestion/abc1.txt";
    public static final String FILE_NAME_2 = "src/fileiopackage/somequestion/abc2.txt";
    public static final String FILE_NAME_3 = "src/fileiopackage/somequestion/abc3.txt";

    public static void main(String[] args) {

        try (
                PrintWriter pw = new PrintWriter(FILE_NAME_3);
                BufferedReader br = new BufferedReader(new FileReader(FILE_NAME_1));
                BufferedReader br1 = new BufferedReader(new FileReader(FILE_NAME_2));
        ) {

            String line = br.readLine();
            String line1 = br1.readLine();

            while (line != null || line1 != null) {

                if (line != null) {
                    pw.println(line);
                    line = br.readLine();
                }
                if (line1 != null) {
                    pw.println(line1);
                    line1 = br1.readLine();
                }
            }

            pw.flush();
//            br.close();
//            br1.close();
//            pw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
