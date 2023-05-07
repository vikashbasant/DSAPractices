package langpackage.stringbuffer;

public class ExStringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Vikash");
        StringBuffer sb1 = new StringBuffer("Vikash");

        // StringBuffer class doesn't override the .equals() method.
        // So .equals() method of Object class we will call.
        // Object class .equals() method do object reference comparison only but not the content comparison.
        System.out.println(sb == sb1); // false
        System.out.println(sb.equals(sb1)); // false
    }

}
