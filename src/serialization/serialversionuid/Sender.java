package serialization.serialversionuid;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Sender {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\serialversionuid\\abc.ser";

    public static void main(String[] args) throws IOException {

        // Create an Object of SerialVersionUIDDemo Class:
        SerialVersionUIDDemo svUID = new SerialVersionUIDDemo();

        // Serializable an svUID object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(svUID);

    }
}