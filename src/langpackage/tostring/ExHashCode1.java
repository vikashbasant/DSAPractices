package langpackage.tostring;

public class ExHashCode1 {
    private int rollNo;

    @Override
    public int hashCode() {
        return 100; // improper hashCode, because every object only 100 is the hashcode.
    }

    public static void main(String[] args) {
        ExHashCode1 ex = new ExHashCode1();
        ExHashCode1 ex2 = new ExHashCode1();
        ExHashCode1 ex3 =  new ExHashCode1();

        // hashCode of every object is same:
        System.out.println(ex); // langpackage.tostring.ExHashCode1@64
        System.out.println(ex2); // langpackage.tostring.ExHashCode1@64
        System.out.println(ex3); // langpackage.tostring.ExHashCode1@64
    }
}
