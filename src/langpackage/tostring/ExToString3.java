package langpackage.tostring;

public class ExToString3 {
    @Override
    public String toString() {
        return getClass().getName();
    }

    public static void main(String[] args) {
        Integer n = new Integer(10);
        String s = new String("vikash");
        ExToString3 exToString3 = new ExToString3();

        System.out.println(s); // vikash
        System.out.println(n); // 10
        System.out.println(exToString3); // langpackage.tostring.ExToString3
    }
}
