package flowcontrol.switchstatement;

public class ExSwitch3 {
    public static void main(String[] args) {
        int x = 10;
        final int y = 20;
        switch (x) {
            case 10:
                System.out.println("10");
            case y:
                System.out.println("20");
        }
        // Output of the code is 10 20
    }
}
