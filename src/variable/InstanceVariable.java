package variable;

public class InstanceVariable {

    private int num;

    private void method() {
        System.out.println(this.num);
    }
    public static void main(String[] args) {
//        System.out.println(num); // Non-static field 'num' cannot be referenced from a static context
        InstanceVariable iv = new InstanceVariable();
        System.out.println(iv.num);
        iv.method();
    }
}
