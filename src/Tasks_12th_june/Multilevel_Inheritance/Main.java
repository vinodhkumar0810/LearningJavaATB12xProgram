package Tasks_12th_june.Multilevel_Inheritance;

public class Main {
    public static void main(String[] args) {
        // Create object of Child class
        Child child = new Child();

        // Access methods from all classes
        child.showGrandparent();  // from Grandparent
        child.showParent();       // from Parent
        child.showChild();        // from Child
    }
}
