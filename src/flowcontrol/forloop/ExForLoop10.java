package flowcontrol.forloop;

public class ExForLoop10 {
    public static void main(String[] args) {
        for(int i = 0; true; i++) // Valid
            System.out.println("Hello");
    }
}
