package declarationsAndAccess.interf;

public interface ExInterface {
    void m1();
    void m2();
}

abstract class ServiceProvider implements ExInterface {

    @Override
    public void m1() {

    }
}

class SubServiceProvider extends ServiceProvider {

    @Override
    public void m2() {

    }
}
