package assertions.augmentversion;

/**
 * assert(b):e;
 * <p/>
 * 'e' will be evaluated if and only if 'b' is false that is if 'b' is true then 'e' won't be evaluated.
 */
public class AugmentVersionDemo1 {
    public static void main(String[] args) {
        int x = 10;
        assert (x > 10) : "Assertion Error: x value increase by one: " + ++x;
        System.out.println(x);
    }
}
