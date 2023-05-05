package oops.encapsulation;

class Student {
    private String name;

    private String email;
    private int rollNo;

    Student() {
        // default constructor:
    }

    Student(String name, String email, int rollNo) {
        this.name = name;
        this.email = email;
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", email='" + this.email + '\'' +
                ", rollNo=" + this.rollNo +
                '}';
    }
}
public class ExEncapsulation {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vikash");
        student.setEmail("basantvikash360@gmail.com");
        student.setRollNo(61);
        System.out.println(student);
    }
}
