package enumorenumration.enumconstructor;

enum BeerDemo2 {
    // enum Constant:
    KF, RC, FO, KO;

    // No-Args Constructor:
    BeerDemo2() {
        System.out.println("No-Args Constructor Of BeerDemo2");
    }
}

/**
 * We can't create an enum object explicitly, and hence we can't invoke enum constructor directly.
 */
public class EnumConstructorDemo2 {
    public static void main(String[] args) {

        /*// =>> CE: java: enum types may not be instantiated
        BeerDemo2 beerObj = new BeerDemo2();*/

        System.out.println("Hello");
    }
}
