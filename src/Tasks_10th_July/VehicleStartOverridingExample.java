package Tasks_10th_July;
// Base class
class Vehicle {
    void start() {
        System.out.println("Starting the vehicle");
    }
}

// Subclass Bike overrides start()
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Kick start the bike");
    }
}

// Subclass Car overrides start()
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Turn the key to start the car");
    }
}
public class VehicleStartOverridingExample {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.start(); // Outputs: Kick start the bike
        car.start();  // Outputs: Turn the key to start the car
    }
}
