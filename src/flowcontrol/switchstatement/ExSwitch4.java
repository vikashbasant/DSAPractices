package flowcontrol.switchstatement;

public class ExSwitch4 {
    public static void main(String[] args) {

        int x = 10;
        switch (x + 1) {
            case 10:
                System.out.println("10");
                break;
            case 10 + 20 + 30:
                System.out.println("60");
                break;
            case 11:
                System.out.println("11");
                break;

        }
    }
}


// output of code is : 11