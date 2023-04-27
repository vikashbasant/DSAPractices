package declarationsAndAccess.jsfs;

import java.util.Date;

public class ExImport {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getClass().getName()); // Output of the code is: java.util.Date
        System.out.println();
    }
}
