package Tasks_15th_July;
/*Inheritance in Java
Definition: A class inherits fields and methods from another class using the extends keyword.*/
class Vehicle {
    String brand = "Ford";

    void drive() {
        System.out.println(brand + " is driving.");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println(brand + " says Beep beep!");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.honk();
    }
}
