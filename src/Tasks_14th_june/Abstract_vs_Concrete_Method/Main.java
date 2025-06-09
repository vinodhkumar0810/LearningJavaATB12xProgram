package Tasks_14th_june.Abstract_vs_Concrete_Method;

public class Main {
    public static void main(String[] args) {
        // Create object of Child
        Child obj = new Child();

        // Call both methods
        obj.display();  // Concrete method from abstract class
        obj.show();     // Implemented abstract method
    }
}
