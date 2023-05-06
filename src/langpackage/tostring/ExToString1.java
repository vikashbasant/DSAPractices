package langpackage.tostring;

public class ExToString1 {
    private String name;
    private int rollNo;
    
    public ExToString1() {
        // Default Constructor:
    }

    public ExToString1(String name, int rollNo) {
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

    public static void main(String[] args) {
        ExToString1 exToString = new ExToString1("vikash", 101);

        // If ExToString1 class doesn't override toSting() method,
        // then internally called Object class toString() method:
        System.out.println(exToString); // langpackage.tostring.ExToString1@1b6d3586
        System.out.println(exToString.toString()); // langpackage.tostring.ExToString1@1b6d3586
    }
}
