package Java_OOPs_and_Exception_Handling.Employee_Hierarchy_with_Salary_Calculation;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    double calculateSalary() {
        return 0.0;
    }
}

// Manager subclass
class Manager extends Employee {
    double baseSalary;
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Developer subclass
class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 60000, 10000);
        Developer developer = new Developer("Bob", 50, 160);
        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }
}
