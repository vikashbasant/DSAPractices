package serialization.customizedserialization;

import java.io.*;

class CustomAccount implements Serializable {

    // Instance Variable:
    String userName = "Vikash";
    transient String password = "Vikas";


    /*
     * Jvm will execute this method automatically at the time of serialization.
     * Hence, at the time of serialization, if we want to perform
     * any extra work, we have to define that in this method only.
     * (Prepare encrypted password and write encrypted password separate to the file )
     */
    private void writeObject(ObjectOutputStream os) throws Exception {

        // This is for default Serialization:
        os.defaultWriteObject();

        // Prepare custom encrypted password:
        String epwd = "123" + this.password;

        // Write custom encrypted password to the file:
        os.writeObject(epwd);

    }

    /*
     * JVM will execute this method automatically at the time of Deserialization.
     * Hence, at the time of Deserialization, if we want to perform any
     * extra activity, we have to define that in this method only.
     * (Read encrypted password, perform decryption and assign decrypted password to the current object password variable)
     */
    private void readObject(ObjectInputStream is) throws Exception {

        // This is for default Deserialization:
        is.defaultReadObject();

        // Read custom encrypted password:
        String epwd = (String) is.readObject();

        // Doing some extra work for actual password:
        this.password = epwd.substring(3);

    }

}

public class CustomizedSerializationDemo1 {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\customizedserialization\\abc.ser";

    public static void main(String[] args) throws Exception {

        // Create an Object of Account Class:
        CustomAccount account = new CustomAccount();
        System.out.println("userName: " + account.userName + ", password: " + account.password); // =>> userName: Vikash, password: Vikas

        // Serialize the object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);

        // Deserialize the object:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        CustomAccount accountObj = (CustomAccount) ois.readObject();

        // After getting the Deserialize object, simply print the information:
        System.out.println("userName: " + accountObj.userName + ", password: " + accountObj.password); // =>> userName: Vikash, password: Vikas
    }
}
