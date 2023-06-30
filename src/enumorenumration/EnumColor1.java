package enumorenumration;

enum ColorDemo {
    BULE,
    RED {
        public void info() {
            System.out.println("Dangerous Color");
        }
    },
    GREEN;

    public void info() {
        System.out.println("Universal Color");
    }
}

public class EnumColor1 {
    public static void main(String[] args) {
        ColorDemo[] values = ColorDemo.values();

        for (ColorDemo value : values) {
            value.info();
        }
    }
}
