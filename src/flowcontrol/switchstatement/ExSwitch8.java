package flowcontrol.switchstatement;

public class ExSwitch8 {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {
            case 97:
                System.out.println("97");
                break;
            case 99:
                System.out.println("99");
                break;
//            case 'a': // Duplicate case labels are not allowed: (97 == 'a')
//                System.out.println('a');
//                break;
        }
    }
}
