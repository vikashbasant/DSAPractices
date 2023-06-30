package enumorenumration;

enum Color {
    BLUE, RED, GREEN;

    public void info() {
        System.out.println("Universal color");
    }
}

public class EnumColor {
    public static void main(String[] args) {
        Color[] c = Color.values();
        for (Color c1 : c) {
            c1.info();
        }

    }
}
