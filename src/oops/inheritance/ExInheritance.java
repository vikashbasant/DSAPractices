package oops.inheritance;

public class ExInheritance {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.methodOne(); // Parent methodOne is Executed.
        // parent.methodTwo(); // can't find methodTow() in class Parent.

        Child child = new Child();
        child.methodOne(); // Parent methodOne is Executed.
        child.methodTwo(); // Child methodTwo is Executed.

        Parent cParent = new Child();
        cParent.methodOne(); // Parent methodOne is Executed.
        // cParent.methodTwo(); // cannot find symbol method methodTwo()

//        Child pChild = new Parent(); // can't hold child class reference, parent class object.


    }
}
