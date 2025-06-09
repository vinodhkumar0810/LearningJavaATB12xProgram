package Tasks_14th_june.Abstract_vs_Concrete_Method;

abstract class Parent {
    // Abstract method
    abstract void show();

    // Concrete method
    void display() {
        System.out.println("Concrete method in abstract class");
    }
}
