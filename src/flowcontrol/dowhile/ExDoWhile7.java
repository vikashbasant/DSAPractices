package flowcontrol.dowhile;

public class ExDoWhile7 {
    public static void main(String[] args) {
        // practically valid statement:
        do {
            System.out.println("hello"); // 1'time going to execute the statement then after that come out from the loop:
        } while (false);
        System.out.println("hi");  // So the output of the code hello hi
    }
}
