package innerclasses.anonymousinnerclasses;

class PopCorn {

    // Instance Method:
    public void taste() {
        System.out.println("PopCorn taste: Salty");
    }
}

public class AnonymousInnerClassDemo {

    public static void main(String[] args) {

        /*
         * We are creating a child class without name for the PopCorn class, and for that
         * child class we are creating an object with Parent PopCorn reference p.
         */
        PopCorn p = new PopCorn() {
            @Override
            public void taste() {
                System.out.println("PopCorn taste: Spicy");
            }
        };
        p.taste(); // =>> PopCorn taste: Spicy
        System.out.println("Class Name of p: " + p.getClass().getName());
        // =>> Class Name of p: innerclasses.anonymousinnerclasses.AnonymousInnerClassDemo$1

        //============================================================================================================//

        // Create an Object of PopCorn Object:
        PopCorn p1 = new PopCorn();
        p1.taste(); // =>> PopCorn taste: Salty
        System.out.println("Class Name of p1: " + p1.getClass().getName());
        // =>> Class Name of p1: innerclasses.anonymousinnerclasses.PopCorn

        //============================================================================================================//

        /*
         * We are creating a child class without name for the PopCorn class, and for that
         * child class we are creating an object with Parent PopCorn reference p2.
         */
        PopCorn p2 = new PopCorn() {
            @Override
            public void taste() {
                System.out.println("PopCorn taste: Sweet");
            }
        };
        p2.taste(); // =>> PopCorn taste: Sweet
        System.out.println("Class Name of p2: " + p2.getClass().getName());
        // =>> Class Name of p2: innerclasses.anonymousinnerclasses.AnonymousInnerClassDemo$2

    }

}
