package fileiopackage.fileio;

import java.io.File;
import java.io.IOException;

/**
 * Write code to create a directory named with vikash1 in the current working directory
 * and create a fine named with abc.txt in that directory.
 */
public class FileDemo3 {
    public static final String DIR_NAME = "vikash1";
    public static final String FILE_NAME = "demo.txt";
    public static void main(String[] args) throws IOException {

        File dir = new File(DIR_NAME);
        System.out.println(dir.exists());
        dir.mkdir();
        System.out.println(dir.exists());

        File file = new File(dir, FILE_NAME);
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());

    }
}
