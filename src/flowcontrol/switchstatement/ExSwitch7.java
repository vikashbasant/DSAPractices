package flowcontrol.switchstatement;

public class ExSwitch7 {
    public static void main(String[] args) {
        byte b = 10;
        switch (b + 1) { // switch statement argument are int(max(int, type of b, type of 1). So case label should we within the range of int.
            case 10:
                System.out.println("10");
                break;
            case 100:
                System.out.println("100");
                break;

            case 1000:
                System.out.println("1000");
                break;
        }
    }
}
