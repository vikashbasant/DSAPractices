package flowcontrol.dowhile;

public class ExDoWhile5 {
    public static void main(String[] args) {
        // Valid statement:
//        do while (true)
//            System.out.println("hello");
//        while(false);

        // We can write this way also:
        do
            while(true)
                System.out.println("hello"); // infinite hello
        while(false);

    }
}
