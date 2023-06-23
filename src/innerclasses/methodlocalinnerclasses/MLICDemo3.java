package innerclasses.methodlocalinnerclasses;

public class MLICDemo3 {
    public static void main(String[] args) {
        MLICDemo3 mlicDemo3 = new MLICDemo3();
        mlicDemo3.methodOne();
    }

    public void methodOne() {

        // Instance Variable:
        int x = 10;

        // Method Local Inner Class:
        class Inner {

            public void methodTwo() {
                System.out.println("Value of x: " + x);
            }

        }

        Inner inner = new Inner();
        inner.methodTwo();

    }
}
