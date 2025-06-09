package stream_api;

@FunctionalInterface
interface P {
    void m1();
}

@FunctionalInterface
interface C extends P {

}

@FunctionalInterface
public interface Intref1 {
    void m1();
}
