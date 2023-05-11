package fileiopackage.fileio;

import java.io.File;
import java.io.IOException;

/**
 * Write a code to create a file named with demo.txt in the current working directory.
 */
public class FileDemo2 {
    public static final String FILE_NAME = "demo.txt";
    public static void main(String[] args) throws IOException {

        File file = new File(FILE_NAME);
        System.out.println(file.exists());

        file.createNewFile();
        System.out.println(file.exists());

    }
}
