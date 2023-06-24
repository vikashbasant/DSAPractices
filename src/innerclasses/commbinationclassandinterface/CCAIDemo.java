package innerclasses.commbinationclassandinterface;

class VehicleType {

    // Inner Interface of VehicleType Class:
    interface Vehicle {
        int getNoOfWheels();
    }

    // Inner Class of VehicleType Class:
    class Bus implements Vehicle {
        @Override
        public int getNoOfWheels() {
            return 6;
        }
    }

    // Inner Class of VehicleType Class:
    class Car implements Vehicle {
        @Override
        public int getNoOfWheels() {
            return 4;
        }
    }


}

public class CCAIDemo {
    public static void main(String[] args) {

        VehicleType vehicleType = new VehicleType();

        VehicleType.Bus bus = vehicleType.new Bus();
        System.out.println("Number of Wheels inside Bus: " + bus.getNoOfWheels());

        VehicleType.Car car = vehicleType.new Car();
        System.out.println("Number of Wheels inside Car: " + car.getNoOfWheels());
    }
}
