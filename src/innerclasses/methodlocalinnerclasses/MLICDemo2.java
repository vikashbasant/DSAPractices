package innerclasses.methodlocalinnerclasses;

/*
 * If we declare methodOne() method as static, then we will get compile time error
 * saying "non-static variable x cannot be referenced from a static context."
 * see line1
 */
public class MLICDemo2 {
    static int y = 20;
    int x = 10;

    public static void main(String[] args) {
        new MLICDemo1().methodOne();
    }

    public static void methodOne() {
        class Inner {
            public void methodTwo() {

                // CE: Non-static field 'x' cannot be referenced from a static context:
                // System.out.println("Value of x: " + x); // =>> line1

                System.out.println("Value of y: " + y);
            }
        }

        Inner inner = new Inner();

        inner.methodTwo();

    }
}
