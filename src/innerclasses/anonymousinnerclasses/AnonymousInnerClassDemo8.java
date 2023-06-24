package innerclasses.anonymousinnerclasses;

class PopCornDemo {
    public void taste() {
        System.out.println("PopCorn taste: Spicy");
    }

}

/*
    Inside Anonymous inner classes we can take or declare new methods, but outside
    anonymous inner classes we can't call these methods directly because we are
    depending on parent reference.

    [Parent reference can be used to hold a child class object,
    but by using that reference we can't call child-specific methods]

    These methods are just for internal purpose only.
 */
public class AnonymousInnerClassDemo8 {
    public static void main(String[] args) {
        PopCornDemo pd = new PopCornDemo() {
            @Override
            public void taste() {
                methodOne(); // =>> valid call(internal purpose)
                System.out.println("PopCorn taste: Salty");
            }

            public void methodOne() {
                System.out.println("Inner Class Specific Method!");
            }
        };

        pd.taste();
        /*
        Inner Class Specific Method!
        PopCorn taste: Salty
        */

        // pd.methodOne(); // =>> here we can not call(outside inner class)

        PopCornDemo p1 = new PopCornDemo();
        p1.taste(); // =>> PopCorn taste: Spicy
    }
}
