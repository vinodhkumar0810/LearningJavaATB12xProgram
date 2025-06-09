package Tasks_9th_june;

public class Mobile {
    private String brand;
    private double price;

    // Constructor 1: Takes only brand
    public Mobile(String brand) {
        this.brand = brand;
        this.price = 0.0; // default price
    }

    // Constructor 2: Takes brand and price
    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to display mobile details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Using first constructor
        Mobile mobile1 = new Mobile("Samsung");
        mobile1.displayDetails();

        System.out.println();

        // Using second constructor
        Mobile mobile2 = new Mobile("Apple", 79999.99);
        mobile2.displayDetails();
    }
}
