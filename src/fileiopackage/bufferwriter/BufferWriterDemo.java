package fileiopackage.bufferwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

    public static final String FILE_NAME = "circket.txt";
    public static void main(String[] args) {

        try(
                FileWriter fw = new FileWriter(FILE_NAME);
                BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(100); // adding aas-icc code:

            bw.write("urga"); // adding string
            bw.newLine();

            bw.write("Software Solutions"); // adding string
            bw.newLine();

            char[] ch = {'a', 'b', 'c'}; // character array
            bw.write(ch);

            bw.flush(); // to guarantee that all data write including last character as well.

            // bw.close(); // It is redundant because here we are using try-with-resource.
            // So it is automatically close the connection.

        } catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
