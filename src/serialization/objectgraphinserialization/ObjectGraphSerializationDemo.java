package serialization.objectgraphinserialization;

import java.io.*;

class Dog implements Serializable {
    Cat cat = new Cat();
}

class Cat implements Serializable {
    Rat rat = new Rat();
}

class Rat implements Serializable {
    int j = 20;
}


/*
 * 1. Whenever we are serializing an object, the set of all objects which are reachable
 *    from that object will be serialized automatically.
 *    This group of objects is nothing but object graph in serialization.
 *
 * 2. In the object graph, every object should be Serializable otherwise we will get runtime
 *    exception saying "NotSerializableException."
 */
public class ObjectGraphSerializationDemo {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\objectgraphinserialization\\abc.ser";

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
        System.out.println(dogObj.cat.rat.j);
    }
}
