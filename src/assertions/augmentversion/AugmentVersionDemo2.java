package assertions.augmentversion;

/**
 * assert(b):e;
 * <p/>
 * For the 2nd argument, we can take method call also but void type method call is not allowed.
 */
public class AugmentVersionDemo2 {
    public static void main(String[] args) {
        int x = 10;
        assert (x > 10) : "Assertion Error: Method Call Value: " + methodOne();
        System.out.println(x);
    }

    public static int methodOne() {
        return 999;
    }
}
