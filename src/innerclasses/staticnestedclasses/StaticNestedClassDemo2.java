package innerclasses.staticnestedclasses;

/*
 * From the normal inner class we can access both static and non-static members of
 * outer class, but from static nested class we can access only static members of
 * outer class.
 */
public class StaticNestedClassDemo2 {

    static int y = 20;
    int x = 10;

    public static void main(String[] args) {

        // Creating an Object static Nested class:
        StaticNestedClassDemo2.Nested nested = new StaticNestedClassDemo2.Nested();

        // call the methodOne() from static Nested Class:
        nested.methodOne();
    }

    static class Nested {
        public void methodOne() {

            // =>> //C.E:non-static variable x cannot be referenced from a static context:
            // System.out.println("Value of x: " + x);

            System.out.println("Value of y: " + y);

        }
    }
}
