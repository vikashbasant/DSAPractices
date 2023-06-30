package enumorenumration.enumconstructor;

enum BeerDemo {

    // BeerDemo Constant:
    KF, KO, RC, FO;

    // No-Args Constructor:
    BeerDemo() {
        System.out.println("No-Args Constructor Of BeerDemo!");
    }
}

/**
 * Enum can contain constructor. Every enum constant represents an object of that enum
 * class which is static, hence all enum constants will be created at the time of class loading
 * automatically and hence constructor will be executed at the time of enum class loading
 * for every enum constants.
 */
public class EnumConstructorDemo1 {
    public static void main(String[] args) {

        // Accessing constant of BeerDemo:
        BeerDemo fo = BeerDemo.FO;

        System.out.println("hello");

        /*
         * Output:
         * No-Args Constructor Of BeerDemo!
         * No-Args Constructor Of BeerDemo!
         * No-Args Constructor Of BeerDemo!
         * No-Args Constructor Of BeerDemo!
         * hello
         * */
    }
}
