package innerclasses.commbinationclassandinterface;

public interface Outer {

    // Instance method:
    void methodOne();

    // Inner Interface:
    interface Inner {
        void methodTwo();
    }

}

//=>> Both Outer and Inner interfaces we can implement independently. <<=//
class TestOuter implements Outer {

    // provide the implementation of methodOne of Outer Interface:
    @Override
    public void methodOne() {
        System.out.println("Outer Interface method implementations");
    }
}

class TestInner implements Outer.Inner {

    // provide the implementation of methodTwo of Inner Interface:
    @Override
    public void methodTwo() {
        System.out.println("Inner Interface method implementations");
    }
}


class TestDemo {
    public static void main(String[] args) {

        // Creating an object of outer class and call methodOne method:
        TestOuter outer = new TestOuter();
        outer.methodOne();

        // Creating an object of inner class and call methodTwo method:
        TestInner inner = new TestInner();
        inner.methodTwo();

    }
}