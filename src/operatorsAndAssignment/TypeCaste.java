package operatorsAndAssignment;

public class TypeCaste {
    public static void main (String[] args) {

        int x = 150;
        // byte b = x; // ce: possible loss of precision found: int, required: byte

        byte b = (byte) x;
        System.out.println(b);

    }
}
