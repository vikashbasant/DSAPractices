package langpackage.equals;

public class ExEquals2 {
    private String name;
    private int rollNo;

    public ExEquals2() {
    }

    public ExEquals2(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj) {

        String name = this.name;
        int rollNo = this.rollNo;

        ExEquals2 that = (ExEquals2) obj;
        String name1 = that.name;
        int rollNo1 = that.rollNo;

        if (name.equals(name1) && rollNo == rollNo1) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        ExEquals2 exEquals1 = new ExEquals2("vikash", 100);
        ExEquals2 exEquals2 = new ExEquals2("vikash", 100);
        ExEquals2 exEquals3 = new ExEquals2("prince", 101);
        ExEquals2 exEquals4 = exEquals2;

        System.out.println(exEquals1.equals(exEquals2)); // true
        System.out.println(exEquals1.equals(exEquals3)); // false
        System.out.println(exEquals1.equals(exEquals4)); // true
        System.out.println(exEquals1.equals(null)); // RE: NPE(NullPointerException)
        System.out.println(exEquals1.equals("Vikash")); // RE: CCE(ClassCastException)
    }
}
