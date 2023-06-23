package innerclasses.normalorregularinnerclasses;

public class OuterClass4 {
    public static void main(String[] args) {

        // => Create an object of OuterClass4:
        OuterClass4 o = new OuterClass4();

        // => call methodTwo() method of OuterClass4:
        o.methodTwo();
    }

    public void methodTwo() {

        // => Create an object of InnerClass4:
        InnerClass4 i = new InnerClass4();

        // => call methodOne() of InnerClass4:
        i.methodOne();
    }

    class InnerClass4 {
        public void methodOne() {
            System.out.println("Inner class methodOne!");
        }
    }
}
