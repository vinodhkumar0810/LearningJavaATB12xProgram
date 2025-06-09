package Tasks_12th_june.Hierarchical_Inheritance;

public class Main {
    public static void main(String[] args) {
        // Car object
        Car car = new Car();
        car.showType();  // from Vehicle
        car.showCar();   // from Car

        System.out.println();

        // Bike object
        Bike bike = new Bike();
        bike.showType(); // from Vehicle
        bike.showBike(); // from Bike
    }
}
