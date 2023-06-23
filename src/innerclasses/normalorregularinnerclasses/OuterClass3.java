package innerclasses.normalorregularinnerclasses;

public class OuterClass3 {
    public static void main(String[] args) {

        // => Create an Object of OuterClass3:
        OuterClass3 o = new OuterClass3();

        // => Create an Object of InnerClass3:
        OuterClass3.InnerClass3 i = o.new InnerClass3();

        // => call methodOne() of InnerClass3:
        i.methodOne(); // => Inner Class Method!

    }

    class InnerClass3 {
        public void methodOne() {
            System.out.println("Inner Class Method!");
        }
    }
}
