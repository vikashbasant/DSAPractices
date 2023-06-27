package serialization.serialversionuid;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Recevier {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\serialversionuid\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // DeSerializable an object:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerialVersionUIDDemo sv = (SerialVersionUIDDemo) ois.readObject();

        // After getting the Deserialize object, simply print the information:
        System.out.println("SerialVersionUIDDemo class value of i: " + sv.i + ", j: " + sv.j);
    }
}