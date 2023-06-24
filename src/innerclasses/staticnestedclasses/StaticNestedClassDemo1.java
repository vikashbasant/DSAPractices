package innerclasses.staticnestedclasses;


/*
 * Inside static nested classes, we can declare static members including main() the method also.
 * Hence, it is possible to invoke static nested class directly from the command prompt.
 */
public class StaticNestedClassDemo1 {
    public static void main(String[] args) {
        System.out.println("StaticNestedClassDemo1 Class Main Method Executed!");
    }

    static class Nested {
        public static void main(String[] args) {
            System.out.println("Nested Class Main Method Executed!");
        }
    }
}
