package serialization.serializationwithrespecttoinheritance;

import java.io.*;

class AnimalDemo {

    // Instance Variable:
    int i = 10;

    // No-Args Constructor:
    AnimalDemo() {
        System.out.println("AnimalDemo Constructor Called");
    }
}

class DogDemo extends AnimalDemo implements Serializable {

    // Instance Variable:
    int j = 20;

    // No-Args Constructor:
    DogDemo() {
        System.out.println("DogDemo Constructor Called");
    }
}

/*
 * Even though parent class does not implements Serializable,
 * we can serialize a child object if child class implements Serializable interface.
 */

/*
 * =================================Rule Given==================================== *
 * 1. Even though parent class does not implements Serializable, we can serialize a child
 * object if child class implements Serializable interface.
 *
 * 2. At the time of serialization, JVM ignores the values of instance variables which
 * are coming from non-Serializable parent then instead of the original value, JVM
 * saves default values for those variables to the file.
 *
 * 3. At the time of Deserialization, JVM checks whether any parent class is non-*Serializable or not.
 * If any parent class is nonSerializable JVM creates a separate
 * object for every non-Serializable parent and shares its instance variables to the current object.
 *
 * 4. To create an object for non-serializable parent, JVM always calls no arg
 * constructor(default constructor) of that non-Serializable parent, hence every non-* Serializable parent
 * should compulsory contain no arg constructor otherwise we will get runtime exception "InvalidClassException."
 *
 * 5. If non-serializable parent is abstract class, then just instance control flow will be
 * performed and share its instance variable to the current object.
 *
 */
public class SerializationWRTInheritanceDemo1 {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\serializationwithrespecttoinheritance\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Create an Object of Dog Class:
        DogDemo dog = new DogDemo();
        dog.i = 888;
        dog.j = 999;
        System.out.println("Dog Class, i value: " + dog.i + ", j value: " + dog.j);

        // Serialize the object:
        System.out.println("=>>Serialization Started!<<=");
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);
        System.out.println("=>>Serialization Ended!<<=");

        // Deserialize the object:
        System.out.println("=>>DeSerialization Started!<<=");
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        DogDemo dogObj = (DogDemo) ois.readObject();
        System.out.println("=>>DeSerialization Ended!<<=");

        // After getting the Deserialize object, simply print the information:
        System.out.println("Dog Class, i value: " + dogObj.i + ", j value: " + dogObj.j); // => Dog Class, i value: 10, j value: 999


    }
}
