package serialization.customizedserialization;

import java.io.*;

class AccountInfo implements Serializable {
    String userName = "Basant";
    transient String password = "Basant";
    transient int pinNo = 1234;


    /*
     * Jvm will execute this method automatically at the time of serialization.
     * Hence, at the time of serialization, if we want to perform
     * any extra work, we have to define that in this method only.
     * (Prepare encrypted password and write encrypted password separate to the file )
     */
    private void writeObject(ObjectOutputStream os) throws IOException {

        // This is for default Serialization:
        os.defaultWriteObject();

        // Prepare custom encrypted password:
        String ePass = "123" + this.password;

        // Prepare custom encrypted pinNo:
        int ePin = (this.pinNo - 10);

        // Write custom encrypted password to the file:
        os.writeObject(ePass);

        // // Write custom encrypted pinNo to the file:
        os.writeObject(ePin);

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
        String ePassword = (String) is.readObject();

        // Doing some extra work for actual password:
        this.password = ePassword.substring(3);

        // Read custom encrypted pinNo:
        int ePinNo = is.readInt();

        // Doing some extra work for actual pinNo:
        this.pinNo = (ePinNo + 10);
    }
}

public class CustomizedSerializationDemo2 {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\customizedserialization\\abc.ser";

    public static void main(String[] args) throws Exception {

        // Create an Object of Account Class:
        AccountInfo account = new AccountInfo();
        System.out.println("userName: " + account.userName + ", password: " + account.password + ", pinNo: " + account.pinNo); // =>> userName: Vikash, password: Vikas

        // Serialize the object:
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);

        // Deserialize the object:
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        AccountInfo accountObj = (AccountInfo) ois.readObject();

        // After getting the Deserialize object, simply print the information:
        System.out.println("userName: " + accountObj.userName + ", password: " + accountObj.password + ", pinNo: " + accountObj.pinNo); // =>> userName: Vikash, password: Vikas
    }
}
