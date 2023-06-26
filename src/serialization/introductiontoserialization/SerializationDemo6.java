package serialization.introductiontoserialization;

import java.io.*;

class DogEx2 implements Serializable {
    int i = 10;
}

class CatEx2 implements Serializable {
    int i = 20;
}

class RatEx2 implements Serializable {
    int i = 30;
}

/*
 * We can serialize any no of objects to the file but in which order
 * we serialized in the same order only we have to deserialize.
 * That Order of Object is important in Serialization.
 * */
public class SerializationDemo6 {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\introductiontoserialization\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // We can create a multiple object of multiple class:
        DogEx2 dogEx = new DogEx2();
        CatEx2 catEx = new CatEx2();
        RatEx2 ratEx = new RatEx2();

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

        try {
            while (deserializationObject != null) {

                if (deserializationObject instanceof RatEx2) {

                    RatEx2 rat = (RatEx2) deserializationObject;

                    // After getting the Deserialize object, simply print the information:
                    System.out.println("From RatEx, Value of i: " + rat.i);

                } else if (deserializationObject instanceof CatEx2) {

                    CatEx2 cat = (CatEx2) deserializationObject;

                    // After getting the Deserialize object, simply print the information:
                    System.out.println("From CatEx, Value of i: " + cat.i);

                } else if (deserializationObject instanceof DogEx2) {

                    DogEx2 dog = (DogEx2) deserializationObject;

                    // After getting the Deserialize object, simply print the information:
                    System.out.println("From DogEx, Value of i: " + dog.i);

                }

                deserializationObject = ois.readObject();
            }
        } catch (EOFException ex) {
            System.out.println("End Of File, into Deserializer Object");
        }


    }
}
