package fileiopackage.printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    
    public static final String FILE_NAME = "toy.txt";
    public static void main(String[] args) {
        try (
                FileWriter fw = new FileWriter(FILE_NAME);
                PrintWriter pw = new PrintWriter(fw)) {

            pw.write(100); // adding asi-cc value to the file
            pw.println("urga"); // adding string data to the file
            pw.println(100); // adding integer number to the file
            pw.println(true); // adding boolean value to the file
            pw.println('c'); // adding character data to the file
            pw.println("durga"); // adding string data to the file

            pw.flush(); // to give a guarantee that all the data inserted into file including last data.

            // pw.close(); // It is redundant because here we are using try-with-resource.
            // So it is automatically close the connection.

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
