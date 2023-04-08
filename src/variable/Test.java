package variable;

public class Test {

    public static void sum(int... args) {
        int total = 0;
        for(int data: args) total += data;
        System.out.println(total);
    }

    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10, 20, 30, 40, 50);
    }
}
