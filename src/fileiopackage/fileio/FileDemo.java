package fileiopackage.fileio;

import java.io.File;
import java.io.IOException;

/**
 * By This program we can create "abc.txt" file inside the cwd, If file is not present in the CWD:
 */
public class FileDemo {
    public static final String FILE_NAME = "abc.txt";
    public static void main(String[] args) throws IOException {

        File f = new File(FILE_NAME);
        System.out.println(f.exists());

        f.createNewFile();
        System.out.println(f.exists());
    }

}
