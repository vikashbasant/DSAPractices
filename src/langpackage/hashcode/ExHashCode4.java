package langpackage.hashcode;

/**
 *  if hashcode of 2 objects are equal then these objects are always equal by ==
 * operator also.(invalid)
 */
public class ExHashCode4 {
    int i;

    public ExHashCode4() {
    }

    public ExHashCode4(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return i + "";
    }
    @Override
    public int hashCode() {
        return i;
    }

    public static void main(String[] args) {
        ExHashCode4 ex = new ExHashCode4(10);
        ExHashCode4 ex1 = new ExHashCode4(10);

        System.out.println(ex.hashCode()); // 10
        System.out.println(ex1.hashCode()); // 10

        System.out.println(ex.equals(ex1)); // false
        System.out.println(ex == ex1); // false
        System.out.println(ex.hashCode() == ex1.hashCode()); // true

    }
}
