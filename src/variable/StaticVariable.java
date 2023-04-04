package variable;

public class StaticVariable {
    int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        StaticVariable s = new StaticVariable();
        s.x = 30;
        s.y = 40;
        StaticVariable s2 = new StaticVariable();
        System.out.println(s2.x + " " + s2.y);
    }
}
