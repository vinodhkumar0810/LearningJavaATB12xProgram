package Tasks_9th_july;

// Base class
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is ready");
    }
}

// Derived class
class Bike extends Vehicle {
    Bike() {
        System.out.println("Bike is ready");
    }
}
public class VehicleConstructorChain {
    public static void main(String[] args) {
        Bike bike = new Bike(); // Create Bike object
    }
}
