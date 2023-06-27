package serialization.externalization;

import java.io.*;

class Account implements Externalizable {

    String userName;
    int accountNo;
    int pinNo;

    // Default Constructor:
    public Account() {
        System.out.println("public no-args constructor of Account class!");
    }

    // Parameterized Constructor:
    public Account(String userName, int accountNo, int pinNo) {
        this.userName = userName;
        this.accountNo = accountNo;
        this.pinNo = pinNo;
    }

    // Implements own custom serializable logic:
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.userName);
        out.writeInt(this.accountNo);
    }

    // Implements own custom deserializable logic:
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.userName = (String) in.readObject();
        this.accountNo = in.readInt();
    }
}

public class ExternalizationDemo {

    public static final String FILE_PATH = "E:\\Ideaproject\\DSA Practices\\src\\serialization\\externalization\\abc.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Create an object of Account Class:
        Account account = new Account("Vikas", 345678, 1234);
        System.out.println("Customer Account userName: " + account.userName + ", accountNo: " + account.accountNo + ", pinNo: " + account.pinNo);

        // Serialize the object:
        System.out.println("=>>Started Serialization!<<=");
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);
        System.out.println("=>>Ended Serialization!<<=");


        // Deserialize the object:
        System.out.println("=>>Started DeSerialization!<<=");
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account acc = (Account) ois.readObject();
        System.out.println("=>>Ended DeSerialization!<<=");


        // After getting the Deserialize object, simply print the information:
        System.out.println("Customer Account userName: " + acc.userName + ", accountNo: " + acc.accountNo + ", pinNo: " + acc.pinNo);

    }
}
