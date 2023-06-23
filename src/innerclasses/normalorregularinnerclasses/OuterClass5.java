package innerclasses.normalorregularinnerclasses;

class Outer {
    class Inner {
        public void methodOne() {
            System.out.println("Inner class methodOne()");
        }
    }
}

public class OuterClass5 {
    public static void main(String[] args) {

        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.methodOne(); // => Inner class methodOne()

        //=====================Both are way are same output=======================//
        new Outer().new Inner().methodOne(); // => Inner class methodOne()

    }
}
