package Tasks_11th_July;
// Base class
class Animal {
    protected void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {
    void doEat() {
        eat(); // Calls the protected method from parent class
    }
}
public class ProtectedAccessExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.doEat();  // Calls Dog's method which calls Animal's protected method
    }
}
