package oops.overloading;

class Animal{}
class Monkey extends Animal{}
public class ExOverloading6 {

    public void methodOne(Animal a) {
        System.out.println("Animal Version");
    }

    public void methodTwo(Monkey m) {
        System.out.println("Monkey Version");
    }

    public static void main(String[] args) {
        ExOverloading6 exOverloading6 = new ExOverloading6();

        Animal a = new Animal();
        exOverloading6.methodOne(a); // Animal Version

        Monkey m = new Monkey();
        exOverloading6.methodTwo(m); // Monkey Version

        Animal a1 = new Monkey();
        exOverloading6.methodOne(a1); // Animal Version
    }
}
