package oops.overloading;

public class ExOverloading3 {

    public void methodOne(String s) {
        System.out.println("String Version");
    }

    public void methodOne(StringBuffer sb) {
        System.out.println("StringBuffer Version");
    }

    public static void main(String[] args) {
        ExOverloading3 exOverloading3 = new ExOverloading3();
        exOverloading3.methodOne("vikash"); // String Version
        exOverloading3.methodOne(new StringBuffer("sai")); // StringBuffer Version
        // exOverloading3.methodOne(null); // reference methodOne() is ambiguous
    }
}

