package operatorsAndAssignment;

public class EvaluationOrderOfJavaOperands {

    private static int m1(int i) {
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        int result = m1(1) + m1(2) * m1(3) / m1(4) + m1(5) * m1(6);
        System.out.println("Final Result = " + result);
    }


}
