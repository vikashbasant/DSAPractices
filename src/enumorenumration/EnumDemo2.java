package enumorenumration;

/**
 * Every enum constant internally <b>public static final</b>, hence we can access by using "enum name".
 * <p/>
 *  Internally inside every enum <b>toString() method is implemented to return the name of
 * the constant.</b>
 */
public class EnumDemo2 {

    public static void main(String[] args) {

        // =>> Local enums are not supported at language level '8'
        /*// enum inside static method:
        enum BeerDemo {
            KO, KF, RC, FO
        }*/

//        BeerDemo b = BeerDemo.KO;
//        System.out.println(b);
    }


}
