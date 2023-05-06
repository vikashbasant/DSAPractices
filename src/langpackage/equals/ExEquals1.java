package langpackage.equals;

public class ExEquals1 {
    private String name;
    private int rollNo;

    public ExEquals1() {
    }

    public ExEquals1(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        ExEquals1 exEquals1 = new ExEquals1("vikash", 100);
        ExEquals1 exEquals2 = new ExEquals1("vikash", 100);
        ExEquals1 exEquals3 = new ExEquals1("prince", 101);
        ExEquals1 exEquals4 = exEquals1;

        System.out.println(exEquals1.equals(exEquals2)); // false
        System.out.println(exEquals1.equals(exEquals3)); // false
        System.out.println(exEquals1.equals(exEquals4)); // true
        
        
    }
}
