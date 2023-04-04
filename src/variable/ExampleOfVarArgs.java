package variable;

public class ExampleOfVarArgs {
    private int sum (int... x) {
        int total = 0;
        for (int data : x) total += data;
        return total;
    }

    public static void main(String[] args) {
        ExampleOfVarArgs example = new ExampleOfVarArgs();
        System.out.println(example.sum());
        System.out.println(example.sum(10, 20));
        System.out.println(example.sum(10, 20, 30, 40, 50));
    }
}
