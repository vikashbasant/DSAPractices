package langpackage.tostring;

public class ExToStringAndHashCode1 {
    private String name;
    private int rollNo;

    public ExToStringAndHashCode1() {
    }

    public ExToStringAndHashCode1(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.rollNo;
    }

    public static void main(String[] args) {

        ExToStringAndHashCode1 ex = new ExToStringAndHashCode1("vikash", 120);
        ExToStringAndHashCode1 ex2 = new ExToStringAndHashCode1("prince", 100);

        System.out.println(ex); // vikash
        System.out.println(ex2); // prince

    }
}
