package operatorsAndAssignment;

public class AssignmentOperator {
    public static void main(String[] args) {

//        int a, b, c, d;
//        a = b = c = d = 20;
//        System.out.println(a + " " + b + " " + c + " " + d);

//        int x = y = z = 20;

//        int b, c, d;
//        int a = b = c = d = 20;
//        System.out.println(a + " " + b + " " + c + " " + d);


        int a, b, c, d;
        a = b = c = d = 20;
        a += b -= c *= d /=2;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);


    }
}
