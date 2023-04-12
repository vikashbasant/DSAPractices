package operatorsAndAssignment;

public class Instanceof {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t instanceof Runnable); // true
        // System.out.println(t instanceof String); // false, compileTime error because it has no parent-child relation.
    }
}
