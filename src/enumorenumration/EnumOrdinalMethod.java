package enumorenumration;

enum BeerDemo1 {
    FO, RC, KO, KF
}

public class EnumOrdinalMethod {
    public static void main(String[] args) {

        // Find list all enum constant:
        BeerDemo1[] values = BeerDemo1.values();

        for (BeerDemo1 value : values) {
            // Find enum value and it ordinal:
            System.out.println(value + " ... " + value.ordinal());
        }
    }
}
