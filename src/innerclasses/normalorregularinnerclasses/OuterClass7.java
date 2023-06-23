package innerclasses.normalorregularinnerclasses;

public class OuterClass7 {

    // Instance Variable of OuterClass7:
    int x = 10;

    public static void main(String[] args) {
        new OuterClass7().new InnerClass7().methodOne();
    }

    class InnerClass7 {

        // Instance Variable of InnerClass7:
        int x = 100;

        public void methodOne() {
            /*
             * Within the inner class "this" always refers a current inner class object.
             * To refer to a current outer class object, we have to use "outer class name.this"
             */

            // Local Variable Of InnerClass7:
            int x = 1000;

            System.out.println("Local Variable of methodOne() x: " + x); // => 1000
            System.out.println("Instance Variable of InnerClass7 x: " + this.x); // => 100
            System.out.println("Instance Variable of InnerClass7 x: " + InnerClass7.this.x); // => 100
            System.out.println("Instance Variable of OuterClass7 x: " + OuterClass7.this.x); // => 10
        }
    }
}
