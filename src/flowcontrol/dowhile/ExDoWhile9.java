package flowcontrol.dowhile;

public class ExDoWhile9 {
    public static void main(String[] args) {
        /*
         * output of the code:
         * hello
         * hi
         * */
        int a = 10, b = 20;
        do {
            System.out.println("hello");
        } while (a > b);
        System.out.println("hi");

    }
}
