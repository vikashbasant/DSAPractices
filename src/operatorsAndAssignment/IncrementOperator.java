package operatorsAndAssignment;

public class IncrementOperator {

    /**
     * In Integral Arithmetic(byte, short, int, long) there is no way to represent the infinity.
     * Hence, if infinite is the result, so we can get arithmetic exception: / by zero.
     *
     * But in floating point Arithmetic(float, double) there is way to represent Infinity.
     *
     * @param args passing args as an command line argument.
     */
    public static void main (String[] args) {
        // System.out.println(10/0); // java.lang.ArithmeticException: / by zero
        // System.out.println(0/0); // java.lang.ArithmeticException: / by zero
        // System.out.println(10/0.0); // Infinity
        // System.out.println(-10/0.0); // -Infinity
        // System.out.println(0.0/0); // NaN


        /*----Property of NaN: For any 'x' value including NaN the following expression return false------:*/
        int x = 10;
        System.out.println(x < Float.NaN); // false
        System.out.println(x <= Float.NaN); //  false
        System.out.println(x > Float.NaN); // false
        System.out.println(x >= Float.NaN); // false
        System.out.println(x == Float.NaN); // false

        System.out.println(x != Float.NaN); // true
        System.out.println(Float.NaN != Float.NaN); // true
    }
}
