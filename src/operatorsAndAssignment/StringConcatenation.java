package operatorsAndAssignment;

/**
 * The Only Operator in java are overloaded i.e '+' operator,
 * Some time it act as Arithmetic Addition Operator &
 * Some time it acts as String Concatenation Operator.
 */
public class StringConcatenation {
    public static void main (String[] args) {
        String str = "vikash";
        int num1 = 10, num2 = 20, num3 = 30;

        System.out.println(str + num1 + num2 + num3); // vikash102030

        System.out.println(num1 + num2 + num3 + str); // 60vikash

        System.out.println(num1 + num2 + str + num3); // 30vikash30

        System.out.println(num1 + str + num2 + num3); // 10vikash2030
    }
}
