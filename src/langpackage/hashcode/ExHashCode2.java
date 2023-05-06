package langpackage.hashcode;

/**
 * If 2 objects are equal by == operator then their hash codes must be same.(valid)
 */
public class ExHashCode2 {
    int i;

    public ExHashCode2() {
    }

    public ExHashCode2(int i) {
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
        ExHashCode2 ex = new ExHashCode2(10);
        ExHashCode2 ex1 = ex;

        System.out.println(ex.hashCode()); // 10
        System.out.println(ex1.hashCode()); // 10

        System.out.println(ex.equals(ex1)); // true
        System.out.println(ex == ex1); // true
        System.out.println(ex.hashCode() == ex1.hashCode()); // true

    }
}
