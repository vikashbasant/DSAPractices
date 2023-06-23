package innerclasses.normalorregularinnerclasses;

public class NestingInnerClass {
    public static void main(String[] args) {

        NestingInnerClass nic = new NestingInnerClass();
        A a = nic.new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.m1(); // => C class method

        //===========================Another Way==================================//

        new NestingInnerClass().new A().new B().new C().m1(); // => C class method
    }

    class A {
        class B {
            class C {
                public void m1() {
                    System.out.println("C class method");
                }
            }
        }
    }
}
