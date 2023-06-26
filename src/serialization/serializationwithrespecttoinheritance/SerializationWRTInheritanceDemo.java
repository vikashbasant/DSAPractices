package serialization.serializationwithrespecttoinheritance;

import java.io.*;

class Animals implements Serializable {

    // Instance Variable:
    int i = 10;

}

class Dog extends Animals {

    // Instance Variable:
    int j = 20;

}

/*
 * If parent class implements Serializable, then automatically every child class by default Serializable.
 * That Serializable nature is inherited from parent to child.
 *
 * Hence, even though child class doesn't implements Serializable,
 * we can serialize a child class object if parent class implements serializable interface
 */
public class SerializationWRTInheritanceDemo {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\serializationwithrespecttoinheritance\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Create an Object of Dog Class:
        Dog dog = new Dog();
        System.out.println("Dog Class, i value: " + dog.i + ", j value: " + dog.j);

        // Serialize the object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);

        // Deserialize the object:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog dogObj = (Dog) ois.readObject();

        // After getting the Deserialize object, simply print the information:
        System.out.println("Dog Class, i value: " + dogObj.i + ", j value: " + dogObj.j);


    }
}
