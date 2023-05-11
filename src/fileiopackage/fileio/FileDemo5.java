package fileiopackage.fileio;

import java.io.File;

/**
 * Write a program to display the names of all files and directory present in "src/fileio".
 * */
public class FileDemo5 {

    public static final String FILE_PATH = "src/fileio";
    public static void main(String[] args) {

        File dir = new File(FILE_PATH);
        System.out.println(dir.exists());

        String[] list = dir.list();
        int count = 0;

        assert list != null;
        for (String subFileOrDir : list) {
            count++;
            System.out.println(subFileOrDir);
        }
        System.out.println("Total number of subFile and subDir present inside " + FILE_PATH + " folder = " + count);
    }
}
