package flowcontrol.forloop;

public class ExForLoop7 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        for (int i = 0; a > b; i++) {
            System.out.println("Hello");
        }
        System.out.println("Hi"); // output of the code is 'Hi'
    }
}
