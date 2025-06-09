package Tasks_12th_june.Super_Keyword_Program;

public class Manager extends Employee{
    @Override
    void showDetails() {
        super.showDetails(); // Call parent class method
        System.out.println("Role: Manager");
        System.out.println("Department: Sales");
    }
}
