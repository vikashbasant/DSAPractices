package innerclasses.staticnestedclasses;

/*
 * static nested class without an existing outer class object, there may
 * be a chance of existing static nested class object.
 * i.e., a static nested class object is not strongly associated with an outer class object.
 */
public class StaticNestedClassDemo {
    public static void main(String[] args) {

        // Creating an object of static Nested classes:
        StaticNestedClassDemo.Nested nested = new StaticNestedClassDemo.Nested();

        // Then call the methodOne() of static Nested Classes:
        nested.methodOne();

    }

    static class Nested {
        public void methodOne() {
            System.out.println("Static Nested Class Method!");
        }
    }
}
