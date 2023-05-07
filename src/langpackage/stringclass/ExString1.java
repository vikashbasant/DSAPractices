package langpackage.stringclass;

public class ExString1 {
    public static void main(String[] args) {
        String s = new String("Vikas");
        String s1 = new String("Vikas");

        // Here String class .equals() method, override the .equals() method for content comparison.
        System.out.println(s == s1); // false
        System.out.println(s.equals(s1)); // true
    }
}
