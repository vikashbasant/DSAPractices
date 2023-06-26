package serialization.introductiontoserialization;

import java.io.*;

class Dog3 implements Serializable {

    // j variable is the final variable, So after value 20 replaces compilation value of variable j:
    // We already know that serialization works on an object but for value:
    // So variable j is also participate in serialization:
    final int j = 20;
    int i = 10;
}

public class SerializationDemo3 {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\introductiontoserialization\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Create an object of Dog Class:
        Dog3 dog = new Dog3();

        // Serialize the object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);

        // Deserialize the object:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog3 dogObj = (Dog3) ois.readObject();

        // After getting the Deserialize object, simply print the information:
        System.out.println("i: " + dogObj.i + ", j: " + dogObj.j);


    }
}
