package langpackage.equals;

public class ExEquals5 {
    private String name;
    private int rollNo;

    public ExEquals5() {
    }

    public ExEquals5(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object that) {

        if (this == that) {
            return true;
        }

        if (that instanceof ExEquals5) {
            ExEquals5 o = (ExEquals5) that;

            if (this.name.equals(o.name) && this.rollNo == o.rollNo) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }


    public static void main(String[] args) {
        ExEquals5 exEquals1 = new ExEquals5("vikash", 100);
        ExEquals5 exEquals2 = new ExEquals5("vikash", 100);
        ExEquals5 exEquals3 = new ExEquals5("prince", 101);
        ExEquals5 exEquals4 = exEquals2;

        System.out.println(exEquals1.equals(exEquals2)); // true
        System.out.println(exEquals1.equals(exEquals3)); // false
        System.out.println(exEquals1.equals(exEquals4)); // true
        System.out.println(exEquals1.equals(null)); // false
        System.out.println(exEquals1.equals("Vikash")); // false
    }
}
