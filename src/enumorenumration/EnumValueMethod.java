package enumorenumration;

enum BeerDemo {
    KF, KO, RC, FO
}

/**
 * Every enum implicitly contains a static values() method to list all constants of enum
 * *
 */
public class EnumValueMethod {
    public static void main(String[] args) {

        //  list all constants of enum:
        BeerDemo[] values = BeerDemo.values();

        for (BeerDemo value : values) {
            System.out.print(value + " ");
        }
    }
}
