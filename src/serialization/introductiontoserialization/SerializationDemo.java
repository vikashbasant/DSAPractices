package serialization.introductiontoserialization;

import java.io.*;

class Dog implements Serializable {
    int i = 10;
    int j = 20;
}

public class SerializationDemo {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\introductiontoserialization\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Create an object of Dog Class:
        Dog dog = new Dog();

        // Serialize the object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);

        // Deserialize the object:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog dogObj = (Dog) ois.readObject();

        // After getting the Deserialize object, simply print the information:
        System.out.println("i: " + dogObj.i + ", j: " + dogObj.j);


    }
}
