package flowcontrol.ifelse;

public class NestedIfElse1 {
    public static void main(String[] args) {
        if(true)
            if(false)
                System.out.println("hello");
        else
                System.out.println("hi");
    }
}
