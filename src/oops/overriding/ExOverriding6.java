package oops.overriding;

class Parent6 {
    public void methodOne() {
        System.out.println("public methodOne of Parent6 classes");
    }
}

class Child6 extends Parent6 {

    // We have an option to increase the scope of modifier but not reduce the scope of modifiers.

//    protected void methodOne() {
//        System.out.println("protected methodOne of Child6 classes, Here we can reduce the scope of modifier public to protected.");
//    }
}
public class ExOverriding6 {
}
