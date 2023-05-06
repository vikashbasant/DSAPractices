package langpackage.tostring;

public class ExToString2 {
    private String name;
    private int rollNo;

    public ExToString2() {
        // Default Constructor:
    }

    public ExToString2(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRolNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    @Override
    public String toString() {
        return this.name + " ... " + this.rollNo;
    }

    public static void main(String[] args) {
        ExToString2 exToString = new ExToString2("vikash", 101);

        // Here toString() is implemented inside the ExToString2 class, then Object class toString() method doesn't call:
        System.out.println(exToString); // vikash ... 101
        System.out.println(exToString.toString()); // vikash ... 101
    }
}
