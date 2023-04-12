package operatorsAndAssignment;

class Student{}

class Customer{}

class Bank{}

public class NewInstanceMethod {
    // passed java.lang.String as an argument.
    public static void main (String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Object o = Class.forName(args[0]).newInstance();
        System.out.println("Object are created: " + o.getClass().getName());
    }
}
