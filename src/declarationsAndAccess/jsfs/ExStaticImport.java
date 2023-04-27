package declarationsAndAccess.jsfs;

// Static import are not recommended for programmer;
import static java.lang.Math.*;

public class ExStaticImport {
    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(max(12,34));
        System.out.println(random());
    }
}
