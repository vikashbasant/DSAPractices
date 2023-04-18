package flowcontrol.switchstatement;

public class ExSwitch6 {
    public static void main(String[] args) {
        byte b = 10;
        switch (b) {
            case 10:
                System.out.println("10");
                break;
            case 100:
                System.out.println("100");
                break;

//            case 1000: // case label is out of the range of switch argument type(-128 Byte 127)
//                System.out.println("1000");
//                break;
        }
    }
}
