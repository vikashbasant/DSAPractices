package fileiopackage.fileio;

import java.io.File;

/**
 * Write a program to display only file names
 */
public class FileDemo6 {
    public static final String DIR_PATH = "src/fileio";
    public static void main(String[] args) {

        File dir = new File(DIR_PATH);

        String[] list = dir.list();
        int count = 0;
        
        assert list != null;
        for (String subFileOrDir : list) {
            File file = new File(dir, subFileOrDir);

            if (file.isFile()) {
                count++;
                System.out.println(subFileOrDir);
            }
        }
        System.out.println("Total No of File present inside the " + DIR_PATH +  " directory = " + count);

    }
}
