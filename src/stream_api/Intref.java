package stream_api;


@FunctionalInterface
public interface Intref {

    // there is only one abstract method present; that means Intref is a Functional Interface.
    void m1();

    default void m2() {

    }

    default void m3() {

    }

    static void m4() {

    }

    static void m5() {

    }

}
