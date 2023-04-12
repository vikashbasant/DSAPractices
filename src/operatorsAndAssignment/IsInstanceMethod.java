package operatorsAndAssignment;

public class IsInstanceMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // we passed Runnable class Name as an argument then we will get ture as an output, because it has parent-child relation.
        // we passed String class Name as an argument then we will get compile time error, because it has no parent-child relation b/w String and thread.
        Thread t = new Thread();
        System.out.println(Class.forName(args[0]).isInstance(t));
    }
}
