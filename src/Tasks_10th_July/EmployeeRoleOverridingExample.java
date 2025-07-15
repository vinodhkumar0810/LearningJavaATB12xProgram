package Tasks_10th_July;
// Base class
class Employee {
    void role() {
        System.out.println("General Employee");
    }
}

// Subclass Manager overrides role()
class Manager extends Employee {
    @Override
    void role() {
        System.out.println("Manager: Manages team and projects");
    }
}

// Subclass Clerk overrides role()
class Clerk extends Employee {
    @Override
    void role() {
        System.out.println("Clerk: Handles office records and paperwork");
    }
}

// Subclass Tester overrides role()
class Tester extends Employee {
    @Override
    void role() {
        System.out.println("Tester: Tests software for bugs and issues");
    }
}

// Main class to run the program
public class EmployeeRoleOverridingExample {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Clerk();
        Employee emp3 = new Tester();

        emp1.role();  // Outputs: Manager: Manages team and projects
        emp2.role();  // Outputs: Clerk: Handles office records and paperwork
        emp3.role();  // Outputs: Tester: Tests software for bugs and issues
    }
}
