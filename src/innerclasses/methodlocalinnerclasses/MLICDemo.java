package innerclasses.methodlocalinnerclasses;

public class MLICDemo {
    public static void main(String[] args) {
        new MLICDemo().methodOne();
    }

    // => Instance method of MLICDemo
    public void methodOne() {

        // Method Local Inner Classes:
        class Inner {

            // Instance method of Inner classes:
            public void sum(int x, int y) {
                System.out.println("Sum of " + x + " and " + y + " number: " + (x + y));
            }
        }

        Inner i = new Inner();
        i.sum(2, 5); // =>> 7
        // => 100 line code:
        i.sum(23, 45); // =>> 68
        // =>> 100 line code:
        i.sum(34, 56); // =>> 90
        // =>> 100 line code:

    }
}
