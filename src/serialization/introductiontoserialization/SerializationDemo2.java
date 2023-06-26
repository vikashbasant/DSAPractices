package serialization.introductiontoserialization;

import java.io.*;

class Dog2 implements Serializable {

    // Here j is a static variable, So it is not participated into Serialization:
    // Because Serialization works on the object level:
    // and j variable is class level variable:
    static int j = 20;
    int i = 10;
}

public class SerializationDemo2 {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\introductiontoserialization\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Create an object of Dog Class:
        Dog2 dog = new Dog2();

        // Serialize the object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);

        // Deserialize the object:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog2 dogObj = (Dog2) ois.readObject();

        // After getting the Deserialize object, simply print the information:
        System.out.println("i: " + dogObj.i + ", j: " + Dog2.j);


    }
}
