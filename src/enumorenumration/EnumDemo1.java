package enumorenumration;

/**
 * Every enum constant internally <b>public static final</b>, hence we can access by using "enum name".
 * <p/>
 *  Internally inside every enum <b>toString() method is implemented to return the name of
 * the constant.</b>
 */
public class EnumDemo1 {

    public static void main(String[] args) {
        BeerDemo b = BeerDemo.KO;
        System.out.println(b);
    }

    // instance inner enum declaration:
    enum BeerDemo {
        KO, KF, RC, FO
    }
}
