package oops.singletoneclass;

/**
 * In this approach, the required object are created at first time when we require an object:
 */
class Demo {
    private static Demo d = null;

    private Demo() {

    }

    public static Demo getDemo() {
        if (d == null) {
            d = new Demo();
        }

        return d;
    }
}
public class ExSingleToneClass1 {
    public static void main(String[] args) {

        Demo d1 = Demo.getDemo();
        System.out.println(d1);

        Demo d2 = Demo.getDemo();
        System.out.println(d2);

        Demo d1000 = Demo.getDemo();
        System.out.println(d1000);

        // If we can print each & every object, then we can get same reference number for all the object.
    }
}
