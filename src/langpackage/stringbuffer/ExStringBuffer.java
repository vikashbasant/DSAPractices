package langpackage.stringbuffer;

public class ExStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Vikash");
        sb.append(" Basant");

        // Here output is 'Vikash Basant' but not vikash, because StringBuffer is Mutable.
        System.out.println(sb);
    }

}
