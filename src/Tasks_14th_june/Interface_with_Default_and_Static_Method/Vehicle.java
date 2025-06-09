package Tasks_14th_june.Interface_with_Default_and_Static_Method;

public interface Vehicle {
    // Default method
    default void start() {
        System.out.println("Vehicle started");
    }

    // Static method
    static void fuelType() {
        System.out.println("Fuel type is Petrol");
    }
}
