package langpackage.hashcode;

/**
 * If hash Codes of 2 objects are not equal then .equals() method always return
 * false.(valid)
 */
public class ExHashCode1 {
    int i;

    public ExHashCode1() {
    }

    public ExHashCode1(int i) {
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
        ExHashCode1 ex = new ExHashCode1(10);
        ExHashCode1 ex1 = new ExHashCode1(20);

        System.out.println(ex.hashCode()); // 10
        System.out.println(ex1.hashCode()); // 20

        System.out.println(ex.equals(ex1)); // false
        System.out.println(ex.hashCode() == ex1.hashCode()); // false

    }
}
