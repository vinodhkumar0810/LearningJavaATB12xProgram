package Tasks_14th_june.Interface_with_Default_and_Static_Method;

public class Main {
    public static void main(String[] args) {
        // Create object of Car
        Car myCar = new Car();
        myCar.start();             // Calls default method

        Vehicle.fuelType();        // Calls static method (no object needed)
    }
}
