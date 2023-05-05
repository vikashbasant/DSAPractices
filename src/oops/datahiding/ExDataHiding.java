package oops.datahiding;

/**
 * Internal data(instance variable) not directly not access from outside:
 * 1. So we can provide private access modifier to the instance variable.
 */
class DataHiding {
    // instance variable:
    private String name;
    private String password;

    // Constructor:
    DataHiding() {
        // default constructor:
    }

    DataHiding(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // providing setter & getters:
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "DataHiding{" +
                "name='" + this.name + '\'' +
                ", password='" + this.password + '\'' +
                '}';
    }
}
public class ExDataHiding {
    public static void main(String[] args) {

        DataHiding dh = new DataHiding();
        dh.setName("vikash");
        dh.setPassword("Basant@123");
        System.out.println(dh);

        DataHiding dh1 = new DataHiding("Prince", "Prince@364");
        System.out.println(dh1);
    }
}
