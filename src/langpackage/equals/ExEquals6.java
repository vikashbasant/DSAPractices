package langpackage.equals;

public class ExEquals6 {
    private String name;
    private int age;

    public ExEquals6() {
    }

    public ExEquals6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExEquals6) {
            ExEquals6 that = (ExEquals6) obj;
            if (this.name.equals(that.name) && this.age == that.age) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ExEquals6 exEquals1 = new ExEquals6("vikash", 13);
        ExEquals6 exEquals2 = new ExEquals6("vikash", 13);
        ExEquals6 exEquals3 = new ExEquals6("prince", 56);
        ExEquals6 exEquals4 = exEquals2;
        Integer num = new Integer(10);

        System.out.println(exEquals1.equals(exEquals2)); // true
        System.out.println(exEquals1.equals(exEquals3)); // false
        System.out.println(exEquals1.equals(exEquals4)); // true
        System.out.println(exEquals1.equals(null)); // false
        System.out.println(exEquals1.equals("Vikash")); // false
        System.out.println(exEquals1.equals(num)); // false
    }
}
