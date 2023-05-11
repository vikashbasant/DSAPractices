package fileiopackage.fileio;

import java.io.File;

/**
 * By this program we can create new directory to cwd: If directory is not already present.
 */
public class FileDemo1 {

    public static final String DIR_NAME = "DemoDir";
    public static void main(String[] args) {
        File file = new File(DIR_NAME);
        System.out.println(file.exists());

        file.mkdir();
        System.out.println(file.exists());
    }
}
