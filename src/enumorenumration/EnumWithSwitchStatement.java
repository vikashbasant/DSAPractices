package enumorenumration;

enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

/**
 * If we are passing an enum type as argument to switch a statement, then every case label
 * should be a valid enum constant otherwise we will get compile time error.
 */
public class EnumWithSwitchStatement {
    public static void main(String[] args) {
        Months months = Months.DECEMBER;
        switch (months) {
            case JANUARY:
                System.out.println("Month: JANUARY");
                break;
            case FEBRUARY:
                System.out.println("Month: FEBRUARY");
                break;
            case MARCH:
                System.out.println("Month: MARCH");
                break;
            case APRIL:
                System.out.println("Month: APRIL");
                break;
            case MAY:
                System.out.println("Month: MAY");
                break;
            case JUNE:
                System.out.println("Month: JUNE");
                break;
            case JULY:
                System.out.println("Month: JULY");
                break;
            case AUGUST:
                System.out.println("Month: AUGUST");
                break;
            case SEPTEMBER:
                System.out.println("Month: SEPTEMBER");
                break;
            case OCTOBER:
                System.out.println("Month: OCTOBER");
                break;
            case NOVEMBER:
                System.out.println("Month: NOVEMBER");
                break;
            case DECEMBER:
                System.out.println("Month: DECEMBER");
                break;
            default:
                System.out.println("Invalid month");
                break;

        }
    }
}
