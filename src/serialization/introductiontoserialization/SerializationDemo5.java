package serialization.introductiontoserialization;

import java.io.*;

class DogEx1 implements Serializable {
    int i = 10;
}

class CatEx1 implements Serializable {
    int i = 20;
}

class RatEx1 implements Serializable {
    int i = 30;
}

/*
 * We can serialize any no of objects to the file but in which order
 * we serialized in the same order only we have to deserialize.
 * That Order of Object is important in Serialization.
 * */
public class SerializationDemo5 {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\introductiontoserialization\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // We can create a multiple object of multiple class:
        DogEx1 dogEx = new DogEx1();
        CatEx1 catEx = new CatEx1();
        RatEx1 ratEx = new RatEx1();

        // Serialize the object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dogEx);
        oos.writeObject(catEx);
        oos.writeObject(ratEx);

        // Deserialize the object:
        // If we don't know the order of objects in Serialization, Then how we can handle:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object deserializationObject = ois.readObject();

        if (deserializationObject instanceof RatEx1) {

            RatEx1 rat = (RatEx1) deserializationObject;

            // After getting the Deserialize object, simply print the information:
            System.out.println("From RatEx, Value of i: " + rat.i);

        } else if (deserializationObject instanceof CatEx1) {

            CatEx1 cat = (CatEx1) deserializationObject;

            // After getting the Deserialize object, simply print the information:
            System.out.println("From CatEx, Value of i: " + cat.i);

        } else if (deserializationObject instanceof DogEx1) {

            DogEx1 dog = (DogEx1) deserializationObject;

            // After getting the Deserialize object, simply print the information:
            System.out.println("From DogEx, Value of i: " + dog.i);

        }


    }
}
