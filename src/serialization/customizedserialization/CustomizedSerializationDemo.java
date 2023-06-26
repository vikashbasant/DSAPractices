package serialization.customizedserialization;

import java.io.*;

class Account implements Serializable {
    String userName = "Vikash";
    transient String password = "Vikas";
}

/*
 * In the above example before a serialization Account object can provide a proper username and password.
 * But after Deserialization Account object can provide only username bur not password.
 * This is due to declaring password as transient.
 * Hence, doing default serialization, there may be a chance of loss of information due to transient keyword.
 *
 * We can recover this loss of information by using customized serialization.
 */
public class CustomizedSerializationDemo {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\customizedserialization\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Create an Object of Account Class:
        Account account = new Account();
        System.out.println("userName: " + account.userName + ", password: " + account.password); // =>> userName: Vikash, password: Vikas

        // Serialize the object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);

        // Deserialize the object:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account accountObj = (Account) ois.readObject();

        // After getting the Deserialize object, simply print the information:
        System.out.println("userName: " + accountObj.userName + ", password: " + accountObj.password); // =>> userName: Vikash, password: null


    }
}
