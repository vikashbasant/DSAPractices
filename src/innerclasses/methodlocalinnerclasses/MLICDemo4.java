package innerclasses.methodlocalinnerclasses;

public class MLICDemo4 {
    static int j = 20;
    int i = 10;

    public static void main(String[] args) {
        new MLICDemo4().methodOne();
    }

    public void methodOne() {
        int k = 30;
        final int m = 40;

        class Inner {
            public void methodTwo() {
                System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", m = " + m);
            }
        }

        Inner inner = new Inner();
        inner.methodTwo();

    }
}
