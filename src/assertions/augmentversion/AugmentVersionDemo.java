package assertions.augmentversion;

public class AugmentVersionDemo {
    public static void main(String[] args) {

        int x = 10;

        assert (x > 10) : "here x value should be > 10 but it is not";

        System.out.println(x);
    }
}
