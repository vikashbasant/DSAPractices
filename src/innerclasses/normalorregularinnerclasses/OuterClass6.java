package innerclasses.normalorregularinnerclasses;


public class OuterClass6 {
    static int y = 20;
    int x = 10;

    public static void main(String[] args) {
        new OuterClass6().new InnerClass6().methodOne();
    }

    class InnerClass6 {
        public void methodOne() {

            /*
             * From inner class we can access all members of outer class (both static and nonstatic,
             *  private and non-private methods and variables) directly.
             * */
            System.out.println("Value Of x: " + x); // => Value Of x: 10
            System.out.println("Value of y: " + y); // => Value Of y: 20
        }

    }
}
