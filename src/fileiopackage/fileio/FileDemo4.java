package fileiopackage.fileio;

import java.io.File;
import java.io.IOException;

/**
 * Write code to create a file named with demo.txt present in "src/fileio" folder:
 */
public class FileDemo4 {

    public static final String DIR_NAME = "src/fileio";
    public static final String FILE_NAME = "demo.txt";
    public static void main(String[] args) throws IOException {

        File file = new File(DIR_NAME, FILE_NAME);
        file.createNewFile();

    }
}
