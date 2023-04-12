package operatorsAndAssignment;

public class EqualityOperator {
    public static void main (String[] args) {
        System.out.println('a' == 97.0); // true

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        System.out.println(t1 == t2); // false, because t1 and t2 are not pointing to same object reference:
        System.out.println(t1 == t3); // true, because t1 and t3 are pointing to same object reference:

        //--------------------------------------------------------------------------------------//
        Thread t = new Thread();
        Object o = new Object();
        String s = new String("Vikash");

        System.out.println(t == o); // false, because here o & t has a parent child relation, both object are
        // pointing to different object reference: that's why output is false.
        System.out.println(o == s); // false, because here o & s has a parent child relation, both object are
        // pointing to different object reference: that's why output is false:
        // System.out.println(t == s); // Compile Time error, because t & s has not a parent child relation, that
        // why's incomparable types: Operator '==' cannot be applied to 'java.lang.Thread', 'java.lang.String'



        String str = new String("vikash");
        System.out.println(str == null); // false

        str = null;
        System.out.println(str == null); // true
        System.out.println(null == null); // true

        System.out.println(~(3)); // -4
        System.out.println(~(-3)); // 2


    }
}
