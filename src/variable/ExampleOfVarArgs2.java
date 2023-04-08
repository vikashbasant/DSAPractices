package variable;

public class ExampleOfVarArgs2 {

    private static void m1(int[]... arr) {
        for (int[] internal : arr) {
            for (int data : internal) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] x = {10,20,30};
        int[] y = {40, 50, 60};
        m1(x, y);
    }
}
