package langpackage.tostring;

public class ExHashCode2 {
    private int rollNo;

    public ExHashCode2() {
    }

    public ExHashCode2(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public int hashCode() {
        return this.rollNo; // proper hashCode, because every object is generate unique hashcode.
    }

    public static void main(String[] args) {
        ExHashCode2 ex = new ExHashCode2(100);
        ExHashCode2 ex2 = new ExHashCode2(120);
        ExHashCode2 ex3 =  new ExHashCode2(90);

        // hashCode of every object is unique:
        System.out.println(ex); // langpackage.tostring.ExHashCode2@64
        System.out.println(ex2); // langpackage.tostring.ExHashCode2@78
        System.out.println(ex3); // langpackage.tostring.ExHashCode2@5a
    }
}
