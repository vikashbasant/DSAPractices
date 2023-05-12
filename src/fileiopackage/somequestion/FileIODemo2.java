package fileiopackage.somequestion;

import java.io.*;

/**
 * Write a program to merge data from all files present in a folder into a
 * new file
 */

public class FileIODemo2 {

    public static final String TARGET_FILE_NAME = "output.txt";
    public static final String FILE_NAME = "src/fileiopackage";

    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter(TARGET_FILE_NAME)) {

            File f = new File(FILE_NAME);

            String[] s = f.list();
            assert s != null;

            for (String s1 : s) {

                BufferedReader br = new BufferedReader(new FileReader(s1));

                String line = br.readLine();
                while (line != null) {
                    pw.println(line);
                    line = br.readLine();
                }
            }
            pw.flush();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}

