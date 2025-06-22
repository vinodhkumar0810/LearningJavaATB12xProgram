package Java_OOPs_and_Exception_Handling.Vehicle_Inheritance_Hierarchy;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car engine starts with a roar!");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike engine starts with a purr!");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike() };
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
