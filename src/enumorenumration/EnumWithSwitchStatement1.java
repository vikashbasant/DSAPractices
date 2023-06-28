package enumorenumration;

enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

/**
 * If we are passing an enum type as argument to switch a statement, then every case label
 * should be a valid enum constant otherwise we will get compile time error.
 */

public class EnumWithSwitchStatement1 {
    public static void main(String[] args) {
        Week weeks = Week.WEDNESDAY;
        if (weeks == Week.WEDNESDAY) {
            System.out.println("Wednesday");
                /*case JANUARY:
                System.out.println("January");
                break;*/
        } else {
            System.out.println("Invaild Week");
        }
    }
}
