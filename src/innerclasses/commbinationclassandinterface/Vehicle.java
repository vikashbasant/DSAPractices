package innerclasses.commbinationclassandinterface;

public interface Vehicle {
    int getNoOfWheels();

    // provide default implementations of getNoOfWheels() method of Vehicle Interface:
    class DefaultVehicle implements Vehicle {
        @Override
        public int getNoOfWheels() {
            return 2;
        }
    }

}

class Bus implements Vehicle {

    // provide custom implementation of getNoOfWheels() of Vehicle Interface:
    @Override
    public int getNoOfWheels() {
        return 6;
    }
}

class Car implements Vehicle {

    // provide custome implementation of getNoOfWheels() of Vehicle Interface:
    @Override
    public int getNoOfWheels() {
        return 4;
    }
}

class VehicleDemo {
    public static void main(String[] args) {

        // Creating an object of DefaultVehicle of Vehicle Interface Inner Class DefaultVehicle:
        // And call getNoOfWheels() method of DefaultVehicle:
        Vehicle.DefaultVehicle defaultVehicle = new Vehicle.DefaultVehicle();
        System.out.println("Default Vehicle Wheels: " + defaultVehicle.getNoOfWheels()); // 2

        // Creating an object of Bus class and call getNoOfWheels() of Bus Class:
        Bus bus = new Bus();
        System.out.println("Bus totals number of wheels: " + bus.getNoOfWheels()); // 6

        // Creating an object of Car class and call getNoOfWheels() of Car Class:
        Car car = new Car();
        System.out.println("Car totals number of wheels: " + car.getNoOfWheels()); // 4
    }
}
