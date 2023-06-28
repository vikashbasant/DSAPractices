package enumorenumration;

enum Beer {
    KO, KF, RC, FO
}

/**
 * Every enum constant internally <b>public static final</b>, hence we can access by using "enum name".
 * <p/>
 *  Internally inside every enum <b>toString() method is implemented to return the name of
 * the constant.</b>
 */
public class EnumDemo {
    public static void main(String[] args) {
        Beer b = Beer.KO;
        System.out.println(b);
    }
}
