package hackerrank;


class Animal {
}

class Monkey extends Animal {
}

class Dummy {
    public void methodOne(Animal a) {
        System.out.println("Animal version");
    }

    public void methodOne(Monkey m) {
        System.out.println("Monkey version");
    }

}


public class Demo {

    public static void main(String[] args) {
        Dummy dummy = new Dummy();

        Animal a = new Animal();
        dummy.methodOne(a);//Animal version

        Monkey m = new Monkey();
        dummy.methodOne(m);//Monkey version

        Animal a1 = new Monkey();
        dummy.methodOne(a1);//Animal version
    }

}
