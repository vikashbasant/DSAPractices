package innerclasses.methodlocalinnerclasses;

/*
 * If we are declaring inner class inside instance method, then
 *  we can access both static and non-static members of outer class directly.
 */
public class MLICDemo1 {

    static int y = 20;
    int x = 10;

    public static void main(String[] args) {
        new MLICDemo1().methodOne();
    }

    public void methodOne() {
        class Inner {
            public void methodTwo() {
                System.out.println("Value of x: " + x);
                System.out.println("Value of y: " + y);
            }
        }

        Inner inner = new Inner();

        inner.methodTwo();

    }
}
