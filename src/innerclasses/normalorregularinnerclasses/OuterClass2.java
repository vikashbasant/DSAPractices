package innerclasses.normalorregularinnerclasses;

public class OuterClass2 {
    class InnerClass2 {

        /*
         * Inside inner class, we can't declare static members.
         * Hence, it is not possible to declare main() the method,
         * and we can't invoke inner class directly from the
         * command prompt.*/

        // Static declarations in inner classes are not supported at language level '8'
        /*public static void main(String[] args) {
            System.out.println("Inner class Main Method");
        }*/
    }
}
