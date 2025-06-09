package Tasks2;

// Base Class
class Employee {
    private String name;
    private int id;
    private double baseSalary;

    // Constructor using this keyword
    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    // Encapsulation - Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Method Overloading - Compile-time polymorphism
    public double calculateSalary() {
        return this.baseSalary;
    }

    public double calculateSalary(double bonus) {
        return this.baseSalary + bonus;
    }

    // Method to override
    public void displayInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Base Salary: " + this.baseSalary);
    }
}

// Subclass - Single Inheritance
class Manager extends Employee {
    private String department;

    // Constructor using super
    public Manager(String name, int id, double baseSalary, String department) {
        super(name, id, baseSalary); // Call to parent constructor
        this.department = department; // this keyword to assign field
    }

    // Method overriding - Runtime Polymorphism
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to parent method
        System.out.println("Department: " + this.department);
    }

    // Additional method in child
    public void manageTeam() {
        System.out.println(this.getName() + " is managing the " + this.department + " department.");
    }
}

// Main class
public class Task_8th_June_1 {
    public static void main(String[] args) {
        // Object creation using Manager
        Manager mgr = new Manager("Vinodh", 101, 75000.0, "Engineering");

        // Method Overriding
        mgr.displayInfo();

        // Method Overloading
        System.out.println("Salary without bonus: " + mgr.calculateSalary());
        System.out.println("Salary with bonus: " + mgr.calculateSalary(10000.0));

        // Custom method
        mgr.manageTeam();
    }
}
