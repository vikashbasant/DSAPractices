package declarationsAndAccess.jsfs;

public abstract class ExAbstractMethod {
    public abstract int getNoOfWheels();
}

class Bus extends ExAbstractMethod {

    @Override
    public int getNoOfWheels() {
        return 4;
    }

    public static void main(String[] args) {
        Bus b = new Bus();
        int noOfWheels = b.getNoOfWheels();
        System.out.println(noOfWheels);

    }
}

class Auto extends ExAbstractMethod {

    @Override
    public int getNoOfWheels() {
        return 3;
    }

    public static void main(String[] args) {
        Auto a = new Auto();
        int noOfWheels = a.getNoOfWheels();
        System.out.println(noOfWheels);
    }
}
