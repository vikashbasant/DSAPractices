package langpackage.equals;

public class ExEquals4 {
    private String name;
    private int rollNo;

    public ExEquals4() {
    }

    public ExEquals4(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj) {

        try {
            
            ExEquals4 that = (ExEquals4) obj;

            if (this.name.equals(that.name) && this.rollNo == that.rollNo) {
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
        ExEquals4 exEquals1 = new ExEquals4("vikash", 100);
        ExEquals4 exEquals2 = new ExEquals4("vikash", 100);
        ExEquals4 exEquals3 = new ExEquals4("prince", 101);
        ExEquals4 exEquals4 = exEquals2;

        System.out.println(exEquals1.equals(exEquals2)); // true
        System.out.println(exEquals1.equals(exEquals3)); // false
        System.out.println(exEquals1.equals(exEquals4)); // true
        System.out.println(exEquals1.equals(null)); // RE: NPE(NullPointerException) but now o/p: false
        System.out.println(exEquals1.equals("Vikash")); // RE: CCE(ClassCastException) but now o/p: false
    }
}
