package oops.overriding;

class Parent3 {
    public final void marry() {
        System.out.println("abc");
    }
}

class Child3 extends Parent3 {

    // 'marry()' cannot override 'marry()' in 'oops.overriding.Parent3'; overridden method is final:

//    public void marry() {
//        System.out.println("xyz");
//    }
}
public class ExOverriding3 {

}
