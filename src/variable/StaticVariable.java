package variable;

public class StaticVariable {
    static int x; // static variable we don't need to initialization because JVM will automatically assign the
    // default value by default.
    public static void main (String[] args) {
        System.out.println(StaticVariable.x);
        System.out.println(x);
        StaticVariable s = new StaticVariable();
        System.out.println(s.x);
    }
}
