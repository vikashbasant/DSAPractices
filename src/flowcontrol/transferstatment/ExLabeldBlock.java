package flowcontrol.transferstatment;

public class ExLabeldBlock {
    public static void main(String[] args) {
        int x = 10;
        l1:
        {
            System.out.println("label begin:");
            if (x == 10) {
                break l1;
            }
            System.out.println("label end");
        }
        System.out.println("Hello");
    }
}
