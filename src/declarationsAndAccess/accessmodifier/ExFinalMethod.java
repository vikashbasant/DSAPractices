package declarationsAndAccess.accessmodifier;

public class ExFinalMethod {
    public void property() {
        System.out.println("Cash + Land + Gold");
    }

    // This is called Overriden Method:
    public final void marriage() {
        System.out.println("abc");
    }
}

class Child extends ExFinalMethod {

    //  Override the marriage() method is not possible because Parent class i.e ExFinalMethod,
    //  declared marriage() method are final.

    // This is known as Overridden method:
//    public void marriage() {
//        System.out.println("xyz");
//    }

    public static void main(String[] args) {
        ExFinalMethod child = new ExFinalMethod();
        child.property();
        child.marriage();
    }
}
