package langpackage.hashcode;

/**
 *  If == operator returns false then their hash codes(may be same (or) may be
 * different) must be different.(invalid)
 */
public class ExHashCode3 {
    int i;

    public ExHashCode3() {
    }

    public ExHashCode3(int i) {
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
        ExHashCode3 ex = new ExHashCode3(10);
        ExHashCode3 ex1 = new ExHashCode3(10);

        System.out.println(ex.hashCode()); // 10
        System.out.println(ex1.hashCode()); // 10

        System.out.println(ex.equals(ex1)); // false
        System.out.println(ex == ex1); // false
        System.out.println(ex.hashCode() == ex1.hashCode()); // true

    }
}
