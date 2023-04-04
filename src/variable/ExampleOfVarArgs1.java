package variable;

public class ExampleOfVarArgs1 {

    private static void method(int[]... x) {
        for (int[] data : x) {
            for (int d : data) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        int[] l = {10,20,30};
        int[] m = {90,80,70,60,50};
        method(l, m);
    }
}
