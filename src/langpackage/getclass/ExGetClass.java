package langpackage.getclass;

public class ExGetClass {
    public static void main(String[] args) {
        Object o = new String("Vikas");
        System.out.println("Runtime object type of o is: " + o.getClass().getName());
    }
}
