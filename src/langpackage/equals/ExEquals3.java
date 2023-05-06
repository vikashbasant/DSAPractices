package langpackage.equals;

public class ExEquals3 {
    private String name;
    private int rollNo;

    public ExEquals3() {
    }

    public ExEquals3(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj) {

        try {
            String name = this.name;
            int rollNo = this.rollNo;

            ExEquals3 that = (ExEquals3) obj;
            String name1 = that.name;
            int rollNo1 = that.rollNo;

            if (name.equals(name1) && rollNo == rollNo1) {
                return true;
            } else {
                return false;
            }
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }


    }


    public static void main(String[] args) {
        ExEquals3 exEquals1 = new ExEquals3("vikash", 100);
        ExEquals3 exEquals2 = new ExEquals3("vikash", 100);
        ExEquals3 exEquals3 = new ExEquals3("prince", 101);
        ExEquals3 exEquals4 = exEquals2;

        System.out.println(exEquals1.equals(exEquals2)); // true
        System.out.println(exEquals1.equals(exEquals3)); // false
        System.out.println(exEquals1.equals(exEquals4)); // true
        System.out.println(exEquals1.equals(null)); // RE: NPE(NullPointerException) but now o/p: false
        System.out.println(exEquals1.equals("Vikash")); // RE: CCE(ClassCastException) but now o/p: false
    }
}
