package variable;

public class StaticVariable {
    static int x = 10;
    public static void main (String[] args) {
        System.out.println(StaticVariable.x);
        System.out.println(x);
        StaticVariable s = new StaticVariable();
        System.out.println(s.x);
    }
}
