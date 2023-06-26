package serialization.introductiontoserialization;

import java.io.*;

class Dog1 implements Serializable {
    int i = 10;

    // Value j original value 20 is not store in the file abc.ser:
    // variable j is transient, so default value of j variable 0 is store in abc.ser:
    transient int j = 20;
}

public class SerializationDemo1 {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\introductiontoserialization\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Create an object of Dog Class:
        Dog1 dog = new Dog1();

        // Serialize the object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);

        // Deserialize the object:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog1 dogObj = (Dog1) ois.readObject();

        // After getting the Deserialize object, simply print the information:
        // so the default value of j will show because variable j is transient:
        System.out.println("i: " + dogObj.i + ", j: " + dogObj.j);


    }
}
