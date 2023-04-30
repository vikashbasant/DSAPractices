package oops.overriding;

abstract class Parent4 {
    public abstract void property();
}

class Child4 extends Parent4 {
    public void property() {
        System.out.println("Build the property for next generation..");
    }
}
public class ExOverriding4 {
}
