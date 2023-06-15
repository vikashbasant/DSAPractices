package test;

import static java.lang.System.exit;

public class BreakTheInfiniteLoopInsideWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        while (true) {
            switch (num) {
                case 1:
                    System.out.println("First Case:");
                    break;
                case 2:
                    System.out.println("Second Case:");
                    break;
            }
            exit(0);

        }
    }
}
