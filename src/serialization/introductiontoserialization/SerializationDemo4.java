package serialization.introductiontoserialization;

import java.io.*;

class DogEx implements Serializable {
    int i = 10;
}

class CatEx implements Serializable {
    int i = 20;
}

class RatEx implements Serializable {
    int i = 30;
}

/*
 * We can serialize any no of objects to the file but in which order
 * we serialized in the same order only we have to deserialize.
 * That Order of Object is important in Serialization.
 * */
public class SerializationDemo4 {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\introductiontoserialization\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // We can create a multiple object of multiple class:
        DogEx dogEx = new DogEx();
        CatEx catEx = new CatEx();
        RatEx ratEx = new RatEx();

        // Serialize the object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dogEx);
        oos.writeObject(catEx);
        oos.writeObject(ratEx);

        // Deserialize the object:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        DogEx dog = (DogEx) ois.readObject();
        CatEx cat = (CatEx) ois.readObject();
        RatEx rat = (RatEx) ois.readObject();

        // After getting the Deserialize object, simply print the information:
        System.out.println("From DogEx, Value of i: " + dog.i);
        System.out.println("From CatEx, Value of i: " + cat.i);
        System.out.println("From RatEx, Value of i: " + rat.i);

    }
}
