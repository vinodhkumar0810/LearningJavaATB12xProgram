package Tasks_14th_june.Abstract_Class_with_Constructor;

abstract class Base {// Constructor in abstract class
    Base() {
        System.out.println("Abstract class constructor called");
    }

    // Regular method
    void show() {
        System.out.println("Method from abstract class");
    }
}
